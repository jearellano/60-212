package lab2;
/*
  Name: James Moore
  Date: May 19 2016
*/
import java.util.*;
public class Lab2_2 {

	public static void main(String[] args) {
		
		String inputString = "";
																		
		String RegularExp = "((Mr | Ms))?[A-Z][a-z]+([A-Z]([a-z]+\\.))?([A-Z](a-z)+)"; 
		
		
		Scanner keyboard = new Scanner(System.in); 
		for(int i = 0; i< 11; i++){
			System.out.println("Type name to test");
			inputString = keyboard.nextLine(); 
			if(inputString.matches(RegularExp))
			{
				System.out.println("Name " + inputString + "is valid af");
			}
			else
			{
				System.out.println(";;;;))))))))) not valid ");
			}
		}
		
		
		
		keyboard.close(); 
		
	}

}
