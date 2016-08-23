package assignment5;

public class MeatFish extends Food{

	private double sugar; 
	private double fat; 
	public MeatFish(String name, double price,double fat)
	{
		super(name,price); 
		this.fat = fat;  
		sugar = 0.0; 
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
