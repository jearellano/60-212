package lab5;

public class Student extends Person{

	private String major; 
	
	public Student(String fullName, String major) 
	{
		super(fullName);
		this.major = major; 
	}

	@Override
	public double getSalary()
	{
		return 0.0;
	}
	
	public String toString()
	{
		return super.toString() + " " + major; 
	}

	@Override
	public double getFamilyIncome() {
		double allTheMoney = 0;
		
		if(spouse != null) allTheMoney += spouse.getSalary(); 
		
		return allTheMoney ;
	}

}
