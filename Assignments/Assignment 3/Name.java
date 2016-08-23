/* Name: James Moore
   Date: June 2nd 2016 
  */
 
package assignment3;
import java.util.*;

public class Name {
	
	private String firstName;
	private String middleName;
	private String lastName; 
	
	// Constructor for Class Name
	public Name(String FullName)
	{
		StringTokenizer myTokens = new StringTokenizer(FullName," ");
		if(myTokens.countTokens() == 2)// first and last 
		{
			firstName = myTokens.nextToken();
			lastName = myTokens.nextToken(); 
			middleName = null;
		}
		else if(myTokens.countTokens() == 3)// full name 
		{
			firstName = myTokens.nextToken();
			middleName = myTokens.nextToken(); 
			lastName = myTokens.nextToken(); 
		}
		else // not either of above
		{
			System.out.println("Not Valid name");
		}
	}// End of Constructor 
	
	// Copy Constructor 
	public Name(Name aName)
	{// considered deep copy because it does not use any other objects? 
		firstName = aName.firstName; 
		middleName = aName.middleName; // if its null then its null..... 
		lastName = aName.lastName; 
	}// End of Copy Constructor 
	
	// setName Method  
	public void setName(String firstName,String middleName, String lastName)
	{
	     this.firstName = firstName;
	     this.middleName = middleName; 
	     this.lastName = lastName; 
	}// End of setName Method
	
	public String toString()
	{
		if(middleName != null)
		{
			return lastName + ", " + firstName + " " + middleName.charAt(0) + "." ;
		}
		else
		{
			return lastName + ", " + firstName + " " ;
		}
	}
	
	
	
	
// Because the instance variables are private have to have getters to access them 
String getFirstName()
{
	return firstName; 
}


String getMiddleName()
{
	return middleName; 
}

String getLastName()
{
	return lastName; 
}

}// End of Class Name 