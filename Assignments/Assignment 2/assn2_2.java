/*James Moore
Date: May 24th 2016
Student id: 104417041 
*/
package assignment2;
import java.util.*;
public class assn2_2 {
	
	public static void main(String[] args) {
		
		String inputString; 												// year
		String RegularExp = "(0[1-9]|1\\d|2\\d|3[0-1])(/|-)(0\\d|1[0-2])(/|-)(\\d\\d|0\\d|1[0-3])";
		
		System.out.print("Enter a Date DD/MM/YY or the format DD-MM-YY: ");
		Scanner keyboard = new Scanner(System.in); 
		inputString = keyboard.nextLine();
		keyboard.close(); 
		if(inputString.matches(RegularExp) == true)
		{
			System.out.println("Valid String ");
		}
		else
		{
			System.out.println("Not Valid String ");
		}
		
	}
}
