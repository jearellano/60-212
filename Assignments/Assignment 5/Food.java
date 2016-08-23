package assignment5;

public abstract class Food {
	protected String name; 
	protected double price; 
	
	public Food(String name, double price)
	{
		this.name = name;
		this.price = price; 
	}
	
	public abstract double getPrice(); 
	public abstract double getFat(); 
	public abstract double getSugar(); 
	public abstract String getName(); 
}
