/* Name: James Moore
   Date: June 2nd 2016 
  */
package lab5;

public class NewWorker extends Person {

	private static int howManyWorkers = 0; 
	private int workerNumber;  
	private Name workerName; 
	private MyDate dateJoiningCompany; 
	private double Salary; 
	private NewWorker Supervisor;  
	
	//Constructor 
	public NewWorker(String workerName,String dateJoiningCompany,double Salary)
	{
		super(workerName);  
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
	public NewWorker(String workerName, String dateJoiningCompany)
	{
		super(workerName); 
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
	
	// setSalary Method
	public void setSalary(double Salary)
	{
		this.Salary = Salary; 
	}
	
	// NEEW STUFF 
	
	// setSupervisor 
	public void setSupervisor(NewWorker Supervisor)
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
			return workerNumber + ": " + super.toString() + dateJoiningCompany.toString() + " " + Salary;
		}
		else
		{
			return workerNumber + ": " + super.toString() + dateJoiningCompany.toString() + " "+ Supervisor.workerName.toString() + " " + Salary;
		}
		
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return Salary;
	}

	@Override
	public double getFamilyIncome() {
		double allTheMoney = 0; 
		if(spouse != null) allTheMoney += spouse.getSalary(); 
		allTheMoney += this.getSalary();
		return allTheMoney;
	}

}
