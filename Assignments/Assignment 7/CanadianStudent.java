package assignment7;

public abstract class CanadianStudent extends Student{
	public String findCountry(){
		return "Canada";
	}
	public CanadianStudent(String studentName, int numberOfCoursesTaken){
		super(studentName, numberOfCoursesTaken);
	}

}
