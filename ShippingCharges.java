//Angelica Marie Valdes
//COP2800-5146
//Assignment 9 Shipping Charges

//package
package cop2800;

//import scanner for input
import java.util.Scanner;

//name public class
public class ShippingCharges 
{

	public static void main(String[] args) 
	{
		//declare variables
		double weight = 0;
		double weightRate = 0;
		double mileage = 0;
		double mileageRate = 0;
		double shippingCost = 0;
		Scanner input = new Scanner(System.in);
		
		//prompt for package weight and mileage
		System.out.println("What is the weight of the package in pounds?");
		weight = input.nextDouble();
		
		System.out.println("How many miles are you shipping the package?");
		mileage = input.nextDouble();
		
		//initialize based on input
		if (weight <= 2 && weight > 0)
		{
			weightRate = 1.10;
		}
		else if (weight > 2 && weight < 6)
		{
			weightRate = 2.20;
		}
		else if (weight > 6 && weight < 10)
		{
			weightRate = 3.70;
		}
		else if (weight >= 10)
		{
			weightRate = 3.80;
		}
		else
		{
			System.out.println("Input weight or mileage error.");
			System.exit(0);
		}
		
		//calculate mileage rate
		mileageRate = Math.ceil(mileage/500);
		
		//calculate shipping cost and output
		shippingCost = weightRate * mileageRate;
		System.out.printf("Your shipping cost is: $%.2f" ,shippingCost);
	}

}
