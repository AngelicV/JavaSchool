//Angelica Marie Valdes
//COP2800-5146
//Assignment 1 Sum of Numbers

//package
package cop2800;

//import scanner class
import java.util.Scanner;

//name public class
public class SumOfNumbers 
{

	public static void main(String[] args) 
	{
		//declare and initialize variables
		int number;
		int sum = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		
		//receive input
		System.out.println("Enter a positive integer: ");
		number = input.nextInt();
		
		//if else statement to make sure input is positive
		if (number < 0)
		{
			System.out.println("Error: Not a positive integer");
			System.exit(0);
		}
		else
		{
			System.out.println("The integer entered is: " + number);
		}
		
		//while loop to accumulate sum
		while (i <= number)
		{
			sum += i;
			i++;
		}

		//output sum
		System.out.println("The sum of all numbers up to " + number +
				" is: " + sum);

		input.close();
	}

}
