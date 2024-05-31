//Angelica Marie Valdes
//COP2800-5146
//Assignment 7: Test Average and Grade

//package
package cop2800;

//import classes
import java.util.Scanner;


public class TestsAgain 
{

	public static void main(String[] args) 
	{
		//declare variables
		double testAve = 0;
		double testSum = 0;
		char testGrade;
		double testScore;
		int i = 1;
		Scanner input = new Scanner(System.in);
		
		//while loop to recieve test grade and output grade for each test
		while (i <= 5)
		{
			System.out.println("Input integer score for test " + i + " : ");
			testScore = input.nextDouble();
			
			testGrade = determineGrade(testScore);
			System.out.println("Test " + i + "'s grade is: " + testGrade);
			
			testSum += testScore;
			
			i++;
		}

		//output test average
		testAve = calcAverage(testSum);
		System.out.println("The average of all 5 tests is: " + testAve);
		
	}
/**
 * determines the grade of a test using if else statements
 * @param score is equivalent to the input test score
 * @return char of test grade
 */
	public static char determineGrade(double score)
	{
		char grade = ' ';
		
		if (score >= 90 && score <=100)
		{
			grade = 'A';
		}
		else if (score >= 80 && score < 90)
		{
			grade = 'B';
		}
		else if (score >= 70 && score < 80)
		{
			grade = 'C';
		}
		else if (score >= 60 && score < 70)
		{
			grade = 'D';
		}
		else if (score >= 0 && score < 60)
		{
			grade = 'F';
		}
		else
		{
			System.out.println("This is not a score from 0-100. Try again.");
			System.exit(0);
		}
		
		return grade;
		
	}
	
	/**
	 * determines test average
	 * @param is the sum of all 5 test scores
	 * @return is the average score of the 5 test
	 */
	public static double calcAverage(double sum)
	{
		double average;
		
		average = sum /5;
		
		return average;
		
	}
}
