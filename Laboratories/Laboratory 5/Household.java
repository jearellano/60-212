package lab5;

public class Household {
	private Person [] householdMembers; 
//	private int howManyPeople; not used 
	
	public Household()
	{
		householdMembers = new Person[10]; 
	}
	
	public Household(int size)
	{
		householdMembers= new Person[size]; 
	}
	
	public void insertNewHouseholdMember(Person aPerson)
	{
		for(int i = 0; i < householdMembers.length; i++)
		{
			if(householdMembers[i] == null)
			{
				householdMembers[i] = aPerson; 
				// howManyPeople++ ; not used
				break;
			}
		}
	}
	
	public String toString()
	{
		String result = ""; 
		// for each loop p points to householdmembers
		for(Person p : householdMembers)
		{
			if(p != null)
			{
			result += p.toString() + "\n";
			} // end inner if 
		}
		return result; 
	}
	
	
}
