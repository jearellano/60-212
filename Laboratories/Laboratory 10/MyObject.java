package lab10;

public class MyObject {
	int avgNumbers[] = {0,0,0,0,0};
	int count = 0;
	
	
	public void insert(int a){
		try
		{
			avgNumbers[count] = a;
			count++; // wont even increment 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You must of tried to enter to many numbers guy");
		}
		
		
		
	}

	public double  calcAverage(){
		
		int sum = 0;
		double result = 0;
		
		for(int i = 0; i < count ; i++){
			sum += avgNumbers[i];
		}
		
		try
		{
			if(count != 0)
			result = ((double) sum)/count;
			else
			{
				throw(new DivideByZeroException());
			}
		}
		catch(DivideByZeroException e)
		{
			
			System.out.println(e.getMessage());
			
		}
		
		
		return result;

	}

}