package lab4;

public class Person {
	
	private Name personName;
	private Person spouse; 
	
	// Constructor 
	public Person(String fullName)
	{
		personName = new Name(fullName); 
	}// 
	
	// Set Spouse
	public void setSpouse(Person aPerson)
	{
		this.spouse = aPerson;
		
	}// 
	
	// To String Person 
	public String toString()
	{
		if(spouse != null)
		{
			return "Name is " + personName.toString() + " Married to " + spouse.personName.toString(); 
		}
			return "Name is " + personName.toString(); 
	}
	
	// New New 
	public double getFamilyIncome()
	{
		double allTheMoney = 0.0; 
		if(spouse != null)
		{
			if(this instanceof NewWorker)
			{
				allTheMoney +=((NewWorker)this).getSalary(); 
			}
			if(spouse instanceof NewWorker)
			{
				allTheMoney +=((NewWorker)spouse).getSalary();  
			}
		}
		else
		{
			if(this instanceof NewWorker)
			{
				allTheMoney +=((NewWorker)this).getSalary();
			}
		}
		
		return allTheMoney; 
	}

	public Name getPersonName()
	{
		return personName; 
	}
}