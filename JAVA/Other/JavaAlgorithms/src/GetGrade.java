import java.util.Scanner;
public class GetGrade {
	
public static void main (String [] args) {
	double score;
	String letter;
	System.out.println("Please type in your code");
	Scanner sc= new Scanner (System.in);
	score=sc.nextDouble();
	if (score >= 90) {
		letter= "A";
	}
	else if (score >= 80) {
		letter= "B";
	}
	else if (score >= 70) {
		letter= "C";
	}
	else if (score >= 60) {
		letter= "D";
	}
	else
		letter="F";
	
	System.out.println("Your grade is "+ score + ". Your letter grade is "+ letter);
	}
	
	
	
}

