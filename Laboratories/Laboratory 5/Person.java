package lab5;

public abstract class Person {
	private Name personName;
	protected Person spouse; 
	
	//Abstract methods 
	public abstract double getSalary();
	public abstract double getFamilyIncome(); 
	
	
	public Person(String fullName)
	{
		personName = new Name(fullName); 
	}
	
	public void setSpouse(Person spouse)
	{
		this.spouse = spouse; 
	}
	
	public String toString()
	{
		if(spouse != null)
		{
			return "Name is " + personName.toString() + "Married to" + spouse.personName.toString();
		}
		else return "Name is" + personName.toString(); 
	}
	
	/*
	public double getFamilyIncome()
	{
		double allTheMoney = 0;
		if(spouse != null)
		{
			if(this instanceof NewWorker)
			{
				allTheMoney += ((NewWorker)this).getSalary(); 
			}
			if(spouse instanceof NewWorker)
			{
				allTheMoney += ((NewWorker)this).getSalary(); 
			}
		}
		else
		{
			if(this instanceof NewWorker)
			{
				allTheMoney += ((NewWorker)this).getSalary();
			}
		}
		return allTheMoney; 
	}
	*/
	
}
