package assignment6;

public class SeniorStudent extends CanadianStudent{
	private double pension; 
	
	public SeniorStudent(String studentName, int numberOfCoursesTaken,double pension)
	{
		super(studentName,numberOfCoursesTaken); 
		this.pension = pension; 
	}
	
	
	public boolean lessThan(Sortable anObject)
	{
		if(anObject instanceof SeniorStudent)
		{
			return super.lessThan(anObject); 
		}
		
		if(anObject instanceof CanadianStudentUnder65)
		{
			return true;
		}
		else if(anObject instanceof ForeignStudent)
		{
			return true; 
		}
		return false; 
	}
	
	
	public String toString()
	{
		String result = ""; 
		result += super.toString() + "\n Pension:" + pension; 
		return result; 
	}


	@Override
	public double computeFees() {
		return 50.00; 
	}
}
