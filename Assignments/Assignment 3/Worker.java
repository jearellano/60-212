/* Name: James Moore
   Date: June 2nd 2016 
  */
package assignment3;

public class Worker {

	private static int howManyWorkers = 0; 
	private int workerNumber;  
	private Name workerName; 
	private MyDate dateJoiningCompany; 
	private double Salary; 
	private Worker Supervisor;  
	
	//Constructor 
	public Worker(String workerName,String dateJoiningCompany,double Salary)
	{
		this.workerName = new Name(workerName); 
		this.dateJoiningCompany = new MyDate(dateJoiningCompany); 
		this.Salary = Salary; 
		

		if(howManyWorkers == 0)
		{
			workerNumber = 1;
			howManyWorkers++; 
		}
		else
		{
			howManyWorkers++;
			workerNumber = howManyWorkers; 
			 
		}
		
	}// end of Constructor 
	
	// Second Constructor 
	public Worker(String workerName, String dateJoiningCompany)
	{
		this.workerName = new Name(workerName); 
		this.dateJoiningCompany = new MyDate(dateJoiningCompany);
		Salary = 0.0; 
		
		if(howManyWorkers == 0)
		{
			workerNumber = 1;
			howManyWorkers++; 
		}
		else
		{
			howManyWorkers++;
			workerNumber = howManyWorkers; 
			 
		}
	}
	
	// Copy Constructor 
	public Worker(Worker aWorker)
	{
		workerName = new Name(aWorker.workerName); 
		dateJoiningCompany = new MyDate(aWorker.dateJoiningCompany);
		Salary = aWorker.Salary; 

		workerNumber = ++howManyWorkers;
	}
	
	// setSalary Method
	public void setSalary(double Salary)
	{
		this.Salary = Salary; 
	}
	
	// NEEW STUFF 
	
	// setSupervisor 
	public void setSupervisor(Worker Supervisor)
	{
		this.Supervisor = Supervisor; 
	}
	// getSupervisor remember privacy leak 
	public Name getSupervisorName()
	{
		return new Name(Supervisor.workerName);
	}
	// getHowManyWorkers
	public static int getHowManyWorkers() {
		return howManyWorkers;
	}
	
	public String toString()
	{
		if(Supervisor == null)
		{
			return workerNumber + ": " + workerName.toString() + dateJoiningCompany.toString() + " " + Salary;
		}
		else
		{
			return workerNumber + ": " + workerName.toString() + dateJoiningCompany.toString() + " "+ Supervisor.workerName.toString() + " " + Salary;
		}
		
	}
	public double getSalary()
	{
		return Salary; 
	}
}
