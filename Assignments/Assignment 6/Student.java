package assignment6;

public abstract class Student implements FeeCalculator,Sortable {
	
	protected static int howManyStudents = 0; 
	private int studentNumber; 
	private String studentName; 
	private int numberOfCoursesTaken; 
	
	
	public abstract String findCountry(); // Abstract method diff for each class that extends  
	
	public Student(String studentName,int numberOfCoursesTaken)
	{
		this.studentName = studentName; 
		this.numberOfCoursesTaken = numberOfCoursesTaken;
		if(howManyStudents == 0)
		{
			studentNumber = 1; 
			howManyStudents++; 
		}
		else
		{
			howManyStudents++;
			studentNumber = howManyStudents; 
		}
	}
	
	public String toString()
	{
		return studentNumber + " " + studentName + " " + findCountry() + " " + computeFees(); 
	}
	
	// Not sure how to develop yet
	public abstract double computeFees();
	
	// less than 
	public boolean lessThan(Sortable anObject)
	{
		if(anObject instanceof Student)
		{
			Student temp = (Student) anObject; 
			if(getName().compareTo(temp.getName()) < 0)
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
	
	public String getName()
	{
		return studentName; 
	}
	public int getClasses()
	{
		return numberOfCoursesTaken; 
	}
}
