//Angelica Marie Valdes
//COP2800-5146
//Assignment 14 Mobile Service Provider Part 2

//package
package cop2800;

//import scanner class for input
import java.util.Scanner;

//name public class
public class MobileServiceProvider2 
{

	public static void main(String[] args) 
	{
		//declare variables
		int cellMinutes = 0;
		double packSavings = 0;
		double monthlyCost = 0;
		double addMinutes = 0;
		double totalCost = 0;
		String subPackage;
		Scanner input = new Scanner(System.in);
		
		//prompt for plan and minutes
		System.out.println("What subscription package do you have?");
		subPackage = input.next();
		
		System.out.println("How many minutes did you use?");
		cellMinutes = input.nextInt();
		
		//determine package and additional minutes cost with switch
		switch(subPackage)
		{
		case "A":
		case "a":
			monthlyCost = 39.99;
			if (cellMinutes > 450)
			{
				addMinutes = (cellMinutes - 450) * 0.45;
			}
			break;
			
		case "B":
		case "b":
			monthlyCost = 59.99;
			if (cellMinutes > 900)
			{
				addMinutes = (cellMinutes - 900) * 0.40;
			}
			break;
			
		case "C":
		case "c":
			monthlyCost = 69.99;
			break;
		
		default:
			System.out.println("Error with provided input.");
			System.exit(0);
			break;
		}
		
		//intialize output total cost for the month
		totalCost = monthlyCost + addMinutes;
		System.out.printf("Your total cost for the month is: $%.2f \n", 
				totalCost);
		System.out.printf("Package cost: $%.2f \nAdded Minutes: $%.2f \n", 
				monthlyCost, addMinutes);
		
		//calculate savings based on package
		switch(subPackage)
		{
		case "A":
		case "a":
			if (totalCost > 59.99 && totalCost < 69.99)
			{
				packSavings = totalCost - 59.99;
				System.out.printf("You could save $%.2f a month with plan B!", 
						packSavings);
			}
			else if (totalCost > 69.99)
			{
				packSavings = totalCost - 69.99;
				System.out.printf("You could save $%.2f a month with plan C!",
						packSavings);
			}
			break;
			
		case "B":
		case "b":
			if (totalCost > 69.99)
			{
				packSavings = totalCost - 69.99;
				System.out.printf("You could save $%.2f a month with plan C!",
						packSavings);
			}
			break;
		}
		

		
	}

}
