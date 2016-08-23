package assignment6;

public abstract class CanadianStudent extends Student{

	public CanadianStudent(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
		// TODO Auto-generated constructor stub
	}
	
	public String findCountry()
	{
		return "Canada"; 
	}
}
