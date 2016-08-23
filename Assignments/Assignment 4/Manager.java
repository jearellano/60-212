package assignment4;

public class Manager extends NewWorker{
	
	public NewWorker [] employeesSupervised = new NewWorker[10]; 
	private static int numWorkersSupervised = 0; 
	
	public Manager(String workerName,String dateJoiningCompany,double Salary)
	{
		super(workerName, dateJoiningCompany,Salary);
		
	}// end of Constructor 
	
	// Second Constructor 
	public Manager(String workerName, String dateJoiningCompany)
	{
		super(workerName,dateJoiningCompany); 
	}
	
	public double getSalary()
	{
		return super.getSalary() + 100 * numWorkersSupervised; 
	}
	
	public void addWorker(NewWorker w)
	{
		employeesSupervised[numWorkersSupervised] = w; 
		numWorkersSupervised++;
	}
	
	public void deleteWorker(NewWorker w)
	{
		for(int i = 0; i < 10; i++)
		{
			if(employeesSupervised[i].equals(w))
			{
				employeesSupervised[i] = null; 
				break;
			}
		}
		numWorkersSupervised--;
	}
	
	
	public String toString()
	{
		for(int i = 0; i < 10; i++)
		{
			if(employeesSupervised[i] != null)
			{
				System.out.println(employeesSupervised[i].getPersonName());
			}
		}
		return super.toString(); 
	}
	
	
}
