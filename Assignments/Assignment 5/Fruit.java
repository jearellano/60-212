package assignment5;

public class Fruit extends Food{
	
	private double sugar; 
	private double fat; 
	
	public Fruit(String name, double price,double sugar)
	{
		super(name,price); 
		this.sugar = sugar;  
		fat = 0.0; 
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public double getFat() {
		// TODO Auto-generated method stub
		return fat;
	}
	@Override
	public double getSugar() {
		// TODO Auto-generated method stub
		return sugar;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	} 
	
}
