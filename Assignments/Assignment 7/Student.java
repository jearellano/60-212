package assignment7;


public abstract class Student implements Sortable, FeeCalculator{
	private static int totalStudents = 0;//to allow for student numbers to be assigned
	private int studentNumber = 0;//the given students number
	private String studentName = null;//student's name
	private int numberOfCoursesTaken;
	

	public Student(String studentName, int numberOfCoursesTaken){
		totalStudents++;
		studentNumber = totalStudents;//increment student number and assign it
		this.numberOfCoursesTaken = numberOfCoursesTaken;
		this.studentName = studentName;// set student name
	}
	
	public abstract String findCountry();
	
	public int getNumberOfCoursesTaken(){
		return numberOfCoursesTaken;
	} 
	
	
	public String toString() {//output a formatted student record
		String output;
		output = "Student #:" + studentNumber + ", Name:" + studentName;
		output += " is from " + findCountry() + "; pays fees $" + computeFees();
		return output;
	}
	
	public String getName() {//return the students name
		return studentName;
	} 

}
