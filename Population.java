//Angelica Marie Valdes
//COP2800-5146
//Assignment 9: Population


//package
package cop2800;

//import scanner for input and math for exponents
import java.util.Scanner;

//name public class
public class Population 
{

	public static void main(String[] args) 
	{
		//declare variables
		int i = 1;
		int startPop;
		int numDays;
		double popIncrease;
		double popSum;
		Scanner input = new Scanner(System.in);
		
		//initialize starting population, increase percent, and number of days
		System.out.println("What is the starting population?: ");
		startPop = input.nextInt();
		popSum = startPop;
		
		System.out.println("What percent will the population "
				+ "increase by daily? Enter a decimal: ");
		popIncrease = input.nextDouble();
		
		System.out.println("Over how many days will the increase occur?: ");
		numDays = input.nextInt();
		
		//no longer need input
		input.close();
		
		//if statements for input errors
		if(startPop < 0 || popIncrease < 0 || numDays <= 0)
		{
			System.out.println("Entered a non-positive # or 0 days,"
					+ " cannot calculate.");
			System.exit(0);
		}
		
		//Output start population
		System.out.println("Starting population is: " + startPop);
		
		//loop for population summary calculation and output
		while (i <= numDays)
		{
			popSum *= (1 + popIncrease);
			System.out.println("Population after " + i + " days: " + popSum);
			i++;
		}
		

	}

}
