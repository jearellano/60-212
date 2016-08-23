package assignment6;

public class ForeignStudent extends Student{

	private String countryOfOrigin; 
	private MyDate dateOfEntryToCanada;  
	public ForeignStudent(String studentName, int numberOfCoursesTaken,String countryOfOrigin,MyDate dateOfEntryToCanada)
	{
		super(studentName, numberOfCoursesTaken);
		// TODO Auto-generated constructor stub
		this.countryOfOrigin = countryOfOrigin; 
		this.dateOfEntryToCanada = dateOfEntryToCanada; 	
	}

	@Override
	public String findCountry() {
		// TODO Auto-generated method stub
		return countryOfOrigin; 
	}
	
	public boolean lessThan(Sortable anObject)
	{
			if(anObject instanceof SeniorStudent)
			{
				return false;
			}
			if(anObject instanceof CanadianStudentUnder65)
			{
				return true; 
			}
			if(anObject instanceof ForeignStudent)
			{
				return super.lessThan(anObject);
			}
		return false; 
	}

	@Override
	public double computeFees() {
		return (getClasses() * 1000.00);
	}
	
}
