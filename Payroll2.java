//Angelica Marie Valdes
//COP2800-5146
//Assignment 2: Payroll

//package
package Payroll2;

//import scanner
import java.util.Scanner;

public class Payroll2 
{
	private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	private int[] hours = new int[7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
		
	/**
	 * calculates the gross pay of employee
	 **/
	public void grossPay()
	{	
		for (int index = 0; index < 7; index++)
		{
			wages[index] = hours[index] * payRate[index];
		}
	}
		
	public int getEmployeeId(int index)
	{
		return employeeId[index];
	}
		
	public int[] getHours()
	{
		return hours;
	}
		
	public int getHours(int index)
	{
		return hours[index];
	}
		
	public double[] getPayrate()
	{
		return payRate;
	}
		
	public double getPayrate(int index)
	{
		return payRate[index];
	}
		
	/**
	 * finds the wage of an employee and returns it.
	 * @param id is employees id number
	 * @return wage or 0 if error
	 */
	public double getWage(int id)
	{
		for (int index = 0; index < 7; index++)
		{
			if (id == employeeId[index])
			{
				return wages[index];
			}
		}
		return 0;
	}
		
	public double[] getWages()
	{
		return wages;
	}
		
	public double getWages(int index)
	{
		return wages[index];
	}
		
	public void setEmployeeId(int index, int employeeId)
	{
		this.employeeId[index] = employeeId; 
	}
		
	public void setHours(int index, int hours)
	{
		this.hours[index] = hours;
	}
		
	public void setPayRate(int index, double payRate)
	{
		this.payRate[index] = payRate;
	}
		
	public void setWages(int index, double wages)
	{
		this.wages[index] = wages;
	}
	
	public static void main(String[] args) 
	{
		//declare variables
		Payroll2 payroll = new Payroll2();
		Scanner input = new Scanner(System.in);
		int hours;
		double payRate;
		double wages;
		int[] employeeID = {5658845, 4520125, 7895122, 8477541, 8451277, 1302850, 7580489};
		
		//for loop to get employee hours and payrate
		for (int i = 0; i < 7; i++) 
		{
			//receive hours worked over 0
			do 
			{
			 System.out.println("Enter the hours worked by employee number " + employeeID[i]+":");
			 hours = input.nextInt();
			}
			while (hours < 0);

			payroll.setHours(i, hours);
			
			//receive payrate
			do 
			{
			 System.out.println("Enter the hourly pay rate for employee number " + employeeID[i]+":" );
			 payRate = input.nextDouble();

			 //print error message if rate is < $6
			 if(payRate < 6.00)
			 {
			 System.out.println("ERROR: Enter 6.00 or greater for pay rate: ");
			 }
			}
			while (payRate < 6.00);
			
			//set necessary values
			 payroll.setPayRate(i, payRate);
			 int empid = payroll.getEmployeeId(i);
			 wages = payroll.getWage(empid);
			 payroll.setWages(i, wages);
		}
		
			//calculate gross pay
			 payroll.grossPay();
		
			//print final id and gross pay
			 for (int i = 0; i < 7; i++) 
			 {
			 System.out.println("\nEmployee ID: " + payroll.getEmployeeId(i));
			 System.out.println("Gross pay: $" +  payroll.getWages(i));
			 }
			

	}

}
