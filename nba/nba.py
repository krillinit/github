from flask import Flask
from flask import render_template
import nba_py
from datetime import datetime

app = Flask (__name__)

@app.route("/")
def index():
    datetime_today =datetime.today()
    pretty_date = datetime_today.strftime("%b %d, %Y")
    games=get_games(datetime_today)
    return render_template("index.html",title="Daily Scores", games=games, pretty_date=pretty_date)

def get_games(date):
    scoreboard = nba_py.Scoreboard(month=date.month, day=date.day,year=date.year)
    line_score =  scoreboard.line_score()
    games=[]
    current_game = {}
    current_game_sequence =0
    game_sequence_counter=0

    for team in line_score:
        if (team["GAME_SEQUENCE"] != current_game_sequence):
            current_game["TEAM_1_ABBREVIATION"] =team ["TEAM_ABBREVIATION"]
            current_game["TEAM_1_WINS_LOSSES"] =team ["TEAM_WINS_LOSSES"]
            current_game["TEAM_1_PTS"] =team ["PTS"]
            current_game["TEAM_1_ID"] =team ["TEAM_ID"]
            current_game_sequence = team["GAME_SEQUENCE"]
            game_sequence_counter +=1
        elif (game_sequence_counter==1):
            current_game["TEAM_2_ABBREVIATION"] =team ["TEAM_ABBREVIATION"]
            current_game["TEAM_2_WINS_LOSSES"] =team ["TEAM_WINS_LOSSES"]
            current_game["TEAM_2_PTS"] =team ["PTS"]
            current_game["TEAM_2_ID"] =team ["TEAM_ID"]
            games.append(current_game)
            current_game = {}
            game_sequence_counter=0

    return games


if __name__=="__main__":
    #app.run(threaded=True)
    app.run(host="0.0.0.0", port=4996, threaded=True, debug=True)
