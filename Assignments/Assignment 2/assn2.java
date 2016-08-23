/*James Moore
Date: May 24th 2016
Student id: 104417041 
*/
package assignment2;
import java.util.*;
public class assn2 {

	public static void main(String[] args) {
		
		String inputString, tempNumerator, tempDenominator; 
		StringTokenizer myTokens; // stores tokens 
		double added = 0, numerator, denominator = 0, testGrade; 
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("Enter Grades: (25/24);(75/100); etc : ");
		inputString = keyboard.nextLine(); 
		keyboard.close();// gets rid of resource leak in java 7 s
		
		myTokens = new StringTokenizer(inputString,";)("); 
	
		int numTokens = myTokens.countTokens(); 
		
		while(myTokens.hasMoreTokens())
		{
			String temp = myTokens.nextToken(); 
			
			StringTokenizer myTokens2 = new StringTokenizer(temp,"(/)");
			
			while(myTokens2.hasMoreTokens())
			{
				if(myTokens2.countTokens() == 2)
				{
					tempNumerator = myTokens2.nextToken();
					tempDenominator = myTokens2.nextToken(); 
					numerator = Double.parseDouble(tempNumerator);
					denominator = Double.parseDouble(tempDenominator); 
				}
				else
				{
					tempNumerator = myTokens.nextToken();
					numerator = Double.parseDouble(tempNumerator);
					denominator = 100; 
				}
				testGrade = ((numerator*100)/denominator); 
				added += testGrade; // adds all the grades up
			}
		}
		double average = added/numTokens; // total marks / number of grades
		System.out.println("The average grade is " + average);
	}// end of main 

}// end of class 
