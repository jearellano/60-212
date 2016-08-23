package assignment7;



public class ForeignStudent extends Student{
	private String countryOfOrigin;
	public ForeignStudent(String studentName, int numberOfCoursesTaken, 
			              String countryOfOrigin, MyDate dateOfEntryToCanada){
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
	}
	
	

	public String findCountry(){
		return countryOfOrigin;
	}
	
	

	public double computeFees(){
		return 1000.0 * getNumberOfCoursesTaken();// foreign students pay $1000/course 
	}

	public boolean lessThan(Sortable anotherStudent){
		String nameOfForeignStudent;
		ForeignStudent aForeignStudent;
		if (anotherStudent instanceof ForeignStudent){
			nameOfForeignStudent = getName();
			aForeignStudent = (ForeignStudent) anotherStudent;
			return (nameOfForeignStudent.compareTo(aForeignStudent.getName()) < 0);
		} else if (anotherStudent instanceof SeniorStudent){
			return false;
		} else {
			return true;
		}
	}

}
