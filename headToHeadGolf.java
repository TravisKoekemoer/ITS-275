package ITS275Project1;

import java.util.Scanner;   

public class headToHeadGolf { 	
	public static void main(String[] args) {
		
		int totalScore1 = 0;
		int totalScore2 = 0;
		int indvidualScore; 
		
		boolean nameTest = false;
	
		float avg1 = 0;
		float avg2 = 0;
		
		String team1;
		String team2;
		
		final int teamSize = 4;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter team 1's name: ");
		team1 = keyboard.nextLine();
		
		System.out.println("Enter team 2's name: ");
		team2 = keyboard.nextLine();
		
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
		
		System.out.println("Enter the individual scores for each player of team " + team1 + ": ");
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Player " + i + " finished with: ");
			indvidualScore = keyboard.nextInt();
			totalScore1 += indvidualScore;
			}
		avg1 = (float) totalScore1/teamSize;
		System.out.println();
		
		
		System.out.println("Enter the individual scores for each player of team " + team2 + ": ");
		
		for (int k = 1; k < 5; k++) {
			System.out.println("Enter the score player " + k + " finished with: ");
			indvidualScore = keyboard.nextInt();
			totalScore2 += indvidualScore;
			}
		avg2 = (float) totalScore2/teamSize;
		
		System.out.println();
		System.out.println("The total score for team " + team1 + " was: " + totalScore1);
		System.out.println("The average score for team " + team1 + " was: " + avg1);
		
		System.out.println();
		System.out.println("The total score for team " + team2 + " was: " + totalScore2);
		System.out.println("The average score for team " + team2 + " was: " + avg2);
		
		System.out.println();

		if (totalScore1 < totalScore2) {
			  System.out.println("Team " + team1 + " won!!!");
			} 
		else if (totalScore1 < totalScore2){
			  System.out.println("Team " + team2 + " won!!!");
		}
		else if (totalScore1 == totalScore2) {
			  System.out.println("It is a tie!!!");
		}
		
	}
}
