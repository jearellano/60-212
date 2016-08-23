package assignment9;

public class SearchableList<T extends Searchable> {
	
	private ListGeneric aList; 
	
	public SearchableList()
	{
		aList = new ListGeneric(); 
	}
	
	public void insert(T x)
	{
		if(aList.listIsEmpty())
		{
			aList.addBeforeCurrent(x);
			aList.restart();
			return;
		}

		if (aList.endOfList())
		{
			aList.addBeforeCurrent(x);
			aList.restart();
			return;
		}
		else
		{
			aList.getNextNode();
			insert(x); 
		}
	}
	
	public T getFirst()
	{
		aList.restart();
		if(aList.listIsEmpty()) return null; 
		return ((T)aList.currentValue()); 
	}
	
	public T getNext()
	{
		aList.getNextNode();
		if(aList.endOfList()){
			aList.restart();
			return null;
		}
		
		return ((T)aList.currentValue());
	}
	
	

public class SearchingIterator {
	Object keyToSearchFor; 
	
	public SearchingIterator(Object keyToSearchFor)
	{
		this.keyToSearchFor = keyToSearchFor; 
	}
	
	public T findFirstMatch()
	{
		if(aList.endOfList())
		{
			aList.restart();
			return null; 
		}
		
		if(keyMatches(aList.currentValue()))
		{
			return (T) aList.currentValue(); 
		}
		// else 
		aList.getNextNode(); 
		return findFirstMatch(); // recursive call 
		
	}
	
	public T findNextMatch()
	{
		aList.getNextNode(); 
		
		if (aList.endOfList() ){
			
			aList.restart();
			return null;
		}
		
		if(keyMatches(aList.currentValue()))
		{
			return (T) aList.currentValue(); 
		}
		
		return findNextMatch(); 
	}
	
	public boolean keyMatches(Object key)
	{
		if(((T)key).keyMatches(keyToSearchFor))
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
	
	
	
	
	
}
	
	
	
	// getIterator method not complete ... 
	public SearchingIterator getIterator(Object key)
	{
		SearchingIterator x = new SearchingIterator(key); 
		return x; 
	}
	
	
	
}
