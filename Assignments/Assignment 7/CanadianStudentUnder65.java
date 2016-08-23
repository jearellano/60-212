package assignment7;


public class CanadianStudentUnder65 extends CanadianStudent{
	public CanadianStudentUnder65(String studentName, int numberOfCoursesTaken){
		super(studentName, numberOfCoursesTaken);
	}
	
	public CanadianStudentUnder65(String studentName){
		this(studentName, 5); // If the maximum number of courses is not specified, the default value will be 5
	} 
	
	public double computeFees(){
		int numberOfCoursesTaken;
		numberOfCoursesTaken = getNumberOfCoursesTaken();
		if (numberOfCoursesTaken >= 4){
			return 800.00; // full time students pay $800/term
		} else {
			return 200.0 * numberOfCoursesTaken;// part time students (those who take 3 or fewer courses) pay $200/course
		}
	}
	
	public boolean lessThan(Sortable anotherStudent){
		Student aCanadianStudentUnder65;// Once you learn Exceoptions you will see that it is reasonable
		                                // to check if anotherStudent can be cast into Student. If not, you 
		                                // should throw an exception since we expect it is possible to cast
		                                // anotherStudent to Student. 
		             
		if (anotherStudent instanceof ForeignStudent){
			return false;
		} else if (anotherStudent instanceof SeniorStudent){
			return false;
		} else {
			aCanadianStudentUnder65 = (Student) anotherStudent; 
			return (this.getName().compareTo(aCanadianStudentUnder65.getName()) < 0);
		}
	}

}
