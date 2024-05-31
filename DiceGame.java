//Angelica Marie Valdes
//COP2800-5146
//Assignment 21: Dice Game

//import package
package cop2800;

//import random class
import java.util.Random;

//name public class
public class DiceGame 
{

	public static void main(String[] args) 
	{
		//declare variables
		int i = 1;
		int compWin = 0;
		int userWin = 0;
		Random ranNum1 = new Random();
		Random ranNum2 = new Random();
		
		//output program description
		System.out.println("This program will roll dice for you and"
				+ " the computer 10 times and determine a winner.\n");
		
		//loop for 10 rolls
		while(i <= 10)
		{
			//roll numbers 1-6
			int compDice = ranNum1.nextInt(5)+1;
			int userDice = ranNum2.nextInt(5)+1;
			
			//output rolls
			System.out.println("Computer Dice: " + compDice);
			System.out.println("User Dice: " + userDice);
			
			//calculate who got higher roll
			if (compDice > userDice)
			{
				compWin++;
				System.out.println("Computer rolled higher.\n");
			}
			else if (compDice < userDice)
			{
				userWin++;
				System.out.println("User rolled higher.\n");
				
			}
			else
			{
				System.out.println("User and computer tied. No points given.\n");
			}
			
			//output round score
			System.out.println("Current score:\nComputer: " + compWin +
					"\nUser: " + userWin + "\n");
			i++;
		}
		
		//output grand winner
		if(compWin > userWin)
		{
			System.out.println("Computer is the grand winner!");
		}
		else if (compWin < userWin)
		{
			System.out.println("User is the grand winner!");
		}
		else
		{
			System.out.println("Computer and user tied... no winner!");
		}

	}

}
