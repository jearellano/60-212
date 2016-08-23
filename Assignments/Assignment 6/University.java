package assignment6;

public class University {
	private Student [] listOfStudents; 
	private int numOfStudents; 
	public University(int maximumNumberOfStudents)
	{
		listOfStudents = new Student[maximumNumberOfStudents]; 
	}
	
	public boolean insertStudent(Student aStudent)
	{
		for(int i = 0; i < listOfStudents.length; i++)
		{
			if(listOfStudents[i] == null)
			{
				listOfStudents[i] = aStudent; 
				numOfStudents++; 
				return true;
			}
		}
		return false; 
	}
	
	public int numberOfStudents(String nameOfCountry)
	{ // always returns amount of students ??
		int counter = 0;
		for(Student s: listOfStudents)
		{
			if(s != null)
			{
				if(s.findCountry().equals(nameOfCountry))
				{
					counter++; 
				}
			
			}
		}
		return counter; 
	}
	
	public String toString()
	{
		String result = ""; 
		result += "There are University Students: " + numOfStudents + "\n";
	
		for(Student s: listOfStudents)
		{
			if(s!= null)
			result += s.toString() + "\n"; 
		}
		return result; 
		
	}
	
	public void sortStudents()
	{
		Sort.sortAnything(listOfStudents, numOfStudents);
	}
	
}
