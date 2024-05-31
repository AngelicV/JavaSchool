//Angelica Marie Valdes
//COP2800-5146
//Assignment 5: Larger than n

//package
package cop2800;

//import scanner
import java.util.Scanner;

public class LargerThanN 
{

	public static void main(String[] args) 
	{
		//declare variables
		int i = 0;
		int length;
		int n;
		Scanner input = new Scanner(System.in);
		
		//set array length
		System.out.println("Enter amount of variables you want in the array (1-100): ");
		length = input.nextInt();
		
		//create array
		int[] array = new int[length];
		
		//make sure array is in bounds
		if(length < 1 || length > 100)
		{
			System.out.println("Array length not within bounds, try again.");
			System.exit(0);
		}
		
		//recieve array values
		while(i < length)
		{
			System.out.println("Enter array element " + (i + 1) + ": ");
			array[i] = input.nextInt();
			i++;
		}
		
		//close input
		input.close();
		
		//find value to compare to
		System.out.println("Enter value  the array elements need to be larger than: ");
		n = input.nextInt();
		
		//for loop to compare and output greater values
		for(i = 0; i < length ; i++)
		{
			if(array[i] > n)
			{
				System.out.println(array[i] + " is greater than " + n + ".");
			}
		}
		

	}

}
