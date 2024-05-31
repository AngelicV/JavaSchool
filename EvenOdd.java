//Angelica Marie Valdes
//COP2800-5146
//Assignment 15: Even/Odd Counter

//package
package cop2800;

//import random class
import java.util.Random;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		//declare variables
		Random randomNumber = new Random();
		int i = 1;
		int evenNums = 0;
		int oddNums = 0;
		boolean isItEven;
		
		//declare program intent
		System.out.println("This program will tell you if a number is even.");
		
		//loop to get 100 random numbers and determine if even or odd
		while (i <= 100)
		{
			int ranNum = randomNumber.nextInt();
			System.out.println("\nThe number is: " + ranNum);
			
			isItEven = isEven(ranNum);
			
			//output whether number is even or odd
			if (isItEven == true)
			{
				System.out.println("The number is even.");
				evenNums++;
			}
			else
			{
				System.out.println("The number is odd.");
				oddNums++;
			}
			
			i++;
		}
		
		System.out.println("There were " + evenNums + " even numbers and "
				+ oddNums + " odd numbers out of 100.");
	

	}

	/**
	 * this method determines whether or not a number is even
	 * @param number is the random number generated and being determined
	 * @return is whether the number being even is true or false
	 */
	public static boolean isEven(int number)
	{
		if ((number % 2) == 0)
		{
		  return true;
		}
		else
		{
		 return false;
		}
	}
}
