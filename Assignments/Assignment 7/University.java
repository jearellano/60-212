package assignment7;



public class University {
	private Student[] listOfStudents; //Array to store all the students at university
	private int numStudentsInUniversity = 0;
	public University(int maximumNumberOfStudents){
		listOfStudents = new Student[maximumNumberOfStudents];
	}
	
	public boolean insertStudent(Student aStudent){
		if (numStudentsInUniversity == listOfStudents.length){
			return false; // array is full - new student not inserted
		} else {
			listOfStudents[numStudentsInUniversity] = aStudent;
			numStudentsInUniversity++;
			return true;
		}
	}
	
	public int numberOfStudents(String nameOfCountry){
		Student aStudent;
		int numberOfStudentsFromSpecifiedCountry = 0;
		for (int index = 0; index < numStudentsInUniversity; index++){
			aStudent = listOfStudents[index];
			if ((aStudent.findCountry()).equals(nameOfCountry)){
				numberOfStudentsFromSpecifiedCountry++;
			}
		}
		return numberOfStudentsFromSpecifiedCountry;
	}
	public void sortStudents(){
		Sort.sortAnything(listOfStudents,  numStudentsInUniversity);
	}
	
	public void sortStudentsInReverse(){
		Sort.sortRev(listOfStudents,  numStudentsInUniversity);
	}
	
	
	public String toString(){
		String outputString;
		Student aStudent;
		outputString = "Number of students in University = " + numStudentsInUniversity + "\n";
		for (int index = 0; index < numStudentsInUniversity; index++){
			aStudent = listOfStudents[index];
			outputString += aStudent + "\n";
		}
		return outputString;
		
	}

}

