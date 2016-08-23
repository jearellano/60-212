package assignment6;

public class CanadianStudentUnder65 extends CanadianStudent {

	
	public CanadianStudentUnder65(String studentName)
	{
		super(studentName,5); // if no info full course load 
	}
	public CanadianStudentUnder65(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
		// TODO Auto-generated constructor stub
	}
	
	public boolean lessThan(Sortable anObject)
	{
		if(anObject instanceof CanadianStudentUnder65)
		{
			return super.lessThan(anObject); 
		}
		if(anObject instanceof ForeignStudent)
		{
			return false;
		}
		else if(anObject instanceof SeniorStudent)
		{
			return false; 
		}
		return false; 
	}
	@Override
	public double computeFees() {
		if(getClasses() >= 4)
		{
			return 800.00; 
		}
		else
		{
			return (getClasses() * 200.00); 
		}
	}
	

}
