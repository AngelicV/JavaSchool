//Angelica Marie Valdes
//COP2800-5146
//Assignment 17: Rock Paper Scissors Game

//package
package cop2800;

//import random class and scanner
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		//declare variables
		boolean didComWin;
		Random randomNum = new Random();
		int compPlay = randomNum.nextInt(2) + 1;
		int userPlay;
		Scanner input = new Scanner(System.in);
		String compWritten;
		
		//output game rules and accept user play
		System.out.println("You are about to play rock, paper, scissors.");
		System.out.println("Input 1 for rock, 2 for paper, and 3 for scissors.");
		userPlay = input.nextInt();
		
		//account for tie
		while (userPlay == compPlay)
		{
			System.out.println("You tied!");
			System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors.");
			userPlay = input.nextInt();
			
			compPlay = randomNum.nextInt(3)+1;
			
		}
		
		//account for input error
		if (userPlay > 3 || userPlay < 1)
		{
			System.out.println("This is not a valid input. Restart game.");
			System.exit(0);
		}
		
		
		//determine winner and get string for computer play
		didComWin = whoWon(compPlay,userPlay);
		compWritten = compThrew(compPlay);
		
		//output win or loss message
		if(didComWin == true)
		{
			System.out.println("Computer threw " + compWritten + " and won!");
		}
		else
		{
			System.out.println("Computer threw " + compWritten + " and lost!");
		}

		//close input
		input.close();
	}

	/**
	 * determines whether or not the computer won
	 * @param computer is for what the computer played
	 * @param user is for what the user played
	 * @return true if computer won and false if didnt
	 */
	public static boolean whoWon(int computer, int user)
	{
		if (computer == 3 && user == 1)
		{
			return false;
		}
		else if(computer > user || (computer == 1 && user == 3))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * gets string for what computer threw
	 * @param computer is the int for the computers play
	 * @return the string of what computer played
	 */
	public static String compThrew(int computer)
	{
		switch(computer)
		{
		case 1:
			return "rock";
		case 2:
			return "paper";
		case 3:
			return "scissors";
		default:
			return "error";
		}
	}
}
