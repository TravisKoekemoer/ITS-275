package ITS275Project1;

import java.util.Scanner;   //This will be used for the scanner class so that the program can read input.

public class headToHeadGolf { 	
	public static void main(String[] args) {
		
		//Initialize all the integer variables
		int totalScore1 = 0;
		int totalScore2 = 0; 
		int indvidualScore; 
		
		// This variable will be used as a flag and for input validation 
		boolean nameTest = false; 
	
		// Initialize all the floating point variables 
		float avg1 = 0; 
		float avg2 = 0;
		
		// Initialize all the string variables 
		String team1; 
		String team2;
		
		// Constant because there should always be four players per team
		final int teamSize = 4; 
		
		// Create a Scanner object for keyboard input as in the exercises we did 
		Scanner keyboard = new Scanner(System.in); 
		
		//Input for team names 
		System.out.println("Enter team 1's name: ");
		team1 = keyboard.nextLine();
		
		System.out.println("Enter team 2's name: ");
		team2 = keyboard.nextLine();
		
		//Input validation for team names
		if (team1.equals(team2) || team1.equals("") || team2.equals("") || team1.equals(null) || team2.equals(null)){
			System.out.println();
			nameTest = true;
			System.out.println("You have to enter a name for each team and make sure you pick different names. Please try again: ");
		}

		
		if (nameTest == true) {
			System.out.println("Enter team 1's name: ");
			team1 = keyboard.nextLine();
			
			System.out.println("Enter team 2's name: ");
			team2 = keyboard.nextLine();
		}
		
		//User enters the individual scores of each player for team 1
		System.out.println("Enter the individual scores for each player of team " + team1 + ": ");
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Player " + i + " finished with: "); //Asks the user for the scores
			indvidualScore = keyboard.nextInt(); //input is received here
			totalScore1 += indvidualScore; //Totals the scores for team one
			}
		avg1 = (float) totalScore1/teamSize; //Average score for team one
		System.out.println();
		
		//User enters the individual scores of each player for team 2
		System.out.println("Enter the individual scores for each player of team " + team2 + ": ");
		
		for (int k = 1; k < 5; k++) {
			System.out.println("Player " + k + " finished with: "); //Asks the user for the scores
			indvidualScore = keyboard.nextInt(); //input is received here
			totalScore2 += indvidualScore; //Totals the scores for team two
			}
		avg2 = (float) totalScore2/teamSize; //Average score for team two
		
		//Output results for team one
		System.out.println();
		System.out.println("The total score for team " + team1 + " was: " + totalScore1);
		System.out.println("The average score for team " + team1 + " was: " + avg1);
		
		//Output results for team two
		System.out.println();
		System.out.println("The total score for team " + team2 + " was: " + totalScore2);
		System.out.println("The average score for team " + team2 + " was: " + avg2);
		
		System.out.println();

		//Tests to see who is the winner and then displays the necessary output
		if (totalScore1 < totalScore2) {
			  System.out.println("Team " + team1 + " won with the lowest score!!!");
			} 
		else if (totalScore1 > totalScore2){
			  System.out.println("Team " + team2 + " won with the lowest score!!!");
		}
		else if (totalScore1 == totalScore2) {
			  System.out.println("It is a tie!!!");
		}
		
	}
}
