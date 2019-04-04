import time, subprocess
from pynput.keyboard import Key, Controller

keyboard = Controller ()
#type in location for league client on computer *** use original location of installation, not desktop app
subprocess.call([''])
time.sleep(10)
#type in password below into keyboard.type
keyboard.type("")
keyboard.press(Key.enter)
keyboard.release(Key.enter)
