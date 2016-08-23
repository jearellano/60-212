package lab9;

public class SortedListOfInt {
	
	ListGeneral myList = new  ListGeneral(); 
	private boolean needToRestart = true; 
	private boolean restartFlag = false;
	public void addElement(int x){
		 
		if(myList.listIsEmpty())
		{
			myList.addAfterCurrent(x);
			return;
		}

		
		if (myList.endOfList())
		{
			myList.addBeforeCurrent(x);
			myList.restart();
			return;
		}
		
		
		if (myList.currentValue() != null){
			int currentValue = (int) (myList.currentValue()); 
			if(currentValue >= x)
			{
				myList.addBeforeCurrent(x);
				myList.restart();
			}
			else if(currentValue < x)
			{
				myList.getNextNode(); 
				addElement(x); 
			}
		}
	}
	
	
	public String retrieve(int lowerLimit, int upperLimit)
	{
		
		if(myList.listIsEmpty())
		{
			return ""; 
		}
		
		if(myList.endOfList() && needToRestart)
		{
			myList.restart();
			needToRestart = false;
			return "" + retrieve(lowerLimit, upperLimit);
		}
		else if(myList.endOfList())
		{
			needToRestart = true; 
			return ""; 
		}
		
		int currentValue = (int) (myList.currentValue());
		
		if(currentValue >= lowerLimit &&  currentValue <= upperLimit)
		{
			
			String result =currentValue + " " ;
			myList.getNextNode(); 
			return result + retrieve(lowerLimit,upperLimit); 
		}
		else
		{
			myList.getNextNode(); 
			return retrieve(lowerLimit,upperLimit); 
		}
	}
	
	public int deleteElement(int x)
	{
		repointToStart(); 
		
		int currentValue; 
		if(myList.endOfList())
		{
			restartFlag = false; 
			return 0; 
		}
		else
		{
			currentValue = (int) myList.currentValue(); 
			if(currentValue == x)
			{
				myList.removeCurrent();
				return deleteElement(x) + 1; 
			}
			else
			{
				myList.getNextNode();
				return deleteElement(x); 
			}
		}
		
	}

	private void repointToStart()
	{
		if(restartFlag == false)
		{
			myList.restart();
			restartFlag = true; 
		}
	}
}	
