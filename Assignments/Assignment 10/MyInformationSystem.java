package assignment10;

import java.util.ArrayList;

public class MyInformationSystem <T> {
	
	// This array list can store objects of type Pair 
	private ArrayList<Pair> myList;
	
	// MyInformationSystem constructor 
	public MyInformationSystem()
	{
		myList =  new ArrayList<Pair>();
	}
	
	public void insert(T value,String key)
	{
		Pair newObject = new Pair(value,key); 
		myList.add(newObject); 
	}
	
	public T retrieve(String keyValue) throws Exception
	{
		for( int i = 0 ;i < myList.size(); i++)
		{
			if(myList.get(i) instanceof Pair)
			{
				if((myList.get(i)).keyMatches(keyValue))
				{
					return (T)myList.get(i).value;
				}
			}
		}
		throw (new Exception());
	}

	
	// Inner Class pair Below 
	private class Pair <T>{
		private T value; 
		private String key; 
		
		// Constructor 
		public Pair(T value, String key)
		{
			this.value = value; 
			this.key = key; 
		}
		
		public boolean keyMatches(String keyValue)
		{
			if(keyValue == key) return true; 
			else return false; 
		}
	} // End Inner Class Pair 
	
	
}
