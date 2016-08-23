package lab6;



public abstract class Person implements HighIncome, Sortable{
	
	private Name personName;
	protected Person spouse; 
	// Abstract Methods
	
	public abstract double getSalary(); 
	public abstract double getFamilyIncome(); 
	
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
	

	@Override
	public boolean lessThan(Sortable anObject) {
	    
	    Person temp; 
	    temp = (Person) anObject; 
	    
	    if(personName.getLastName().compareTo(temp.personName.getLastName()) > 0 )
	    {
	    	return true; 
	    }
	    if(personName.getLastName().compareTo(temp.personName.getLastName()) == 0)
	    {
	    	if(personName.getFirstName().compareTo(temp.personName.getFirstName()) > 0)
	    	{
	    		return true; 
	    	}
	    	else
	    	{
	    		return false; 
	    	}  
	    }
	    return false; 
	}
	
	// Can only see this in student not NewWorker 
	public boolean fatCat()
	{
		
		if(getSalary() < 3000)
		{
			return false;
		}
		else
		{
			return true; 
		}
	}
	
	
	
	public Name getPersonName()
	{
		return personName; 
	}
	
}
	
	
