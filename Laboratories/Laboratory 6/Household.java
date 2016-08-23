package lab6;

public class Household {
	private Person [] householdMembers; 
	private int howManyPeople = 0; 
	
	public Household()
	{
		householdMembers = new Person[10]; //Changed 
	}
	
	public Household(int size)
	{
		householdMembers = new Person[size]; 
	}
	
	public void insertNewHouseholdMember(Person aPerson)
	{
		for(int i = 0; i < householdMembers.length; i++)
		{
			if(householdMembers[i] == null)
			{
				householdMembers[i] = aPerson;
				howManyPeople++;
				break; 
			}
		}
	}
	
	public int findNumberOfFatCats()
	{
		int fatcats = 0; 
		for(int i = 0; i < howManyPeople; i++)
		{
			if(householdMembers[i].fatCat() == true)
			{
				fatcats++; 
			}
		}
		return fatcats; 
	}
	
	
	public String sortHouseholdMembers()
	{
		Sort.sortAnything(householdMembers, howManyPeople);
		
		String result = ""; 
		for(Person p: householdMembers)
		{
			if(p != null)
			{
				result += p.toString() + "\n"; 
			}
		
		}
		return result; 
	}
	
	
	// House Hold toString 
	public String toString()
	{
		String result = ""; 
		for(Person p: householdMembers)
		{
			if(p != null)
			{
			result += p.toString() + "\n"; 
			}
			
		}
		return result; 
	}
	
	public int getHowManyPeople()
	{
		return howManyPeople; 
	}
}
