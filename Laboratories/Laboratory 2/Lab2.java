package lab2;
/*
  Name: James Moore
  Date: May 19 2016
*/
import java.util.*;  

public class Lab2 {

	public static void main(String[] args) {
		
		String inputString; // input string  
		StringTokenizer myTokens; // stores tokens 
		String Token; // used to store token each loop 
		String Longest = ""; //  
		String vowels = "aeiouAEIOU"; 
		int numberOfVowels = 0; 
		
		
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("Enter a Line of text: ");
		inputString = keyboard.nextLine(); 
		keyboard.close();// gets rid of resource leak in java 7 s
		
		myTokens = new StringTokenizer(inputString," "); 
		
		while(myTokens.hasMoreTokens() != false)
		{// will run while their' tokens 
			
			Token = myTokens.nextToken(); 
			System.out.println(Token);
			// Code to find longest word 
			if( Token.length() > Longest.length() )
			{
				Longest = Token; 
			}
			// code to find vowels ******
			for(int x = 0; x < Token.length(); x++){
				for(int y = 0; y < vowels.length(); y++){
					if( Token.charAt(x) == vowels.charAt(y)){
						numberOfVowels++; 
					}
				}
			} // end of for 
			
		}// end of while 
		
		System.out.println("The Longest Word Is: " + Longest);
		System.out.println("The Total Number Of Vowels: " + numberOfVowels);
	}// end of main 

}// end of class 
