package assignment5;

import java.util.*; 

public class GroceryInventory {
	private static double Apples = 200.35, Oranges = 38; // fruits 
	private static double Bread = 672, Rice = 20.0; // carbohydrates 
	private static double Chicken = 538.32; // meats 

	public static void main(String[] args) { 
		
		String input = ""; 
		double quantity; 
		String food = "";
		double totalPrice = 0.0; 
		double totalFat = 0.0; 
		double totalSugar = 0; 
		
		System.out.println("Inventory-----");
		System.out.println("Apples " + Apples + " Oranges " + Oranges);
		System.out.println("Loafs of Bread : " + Bread + " KG of Rice " + Rice);
		System.out.println("Kg of Chicken "+ Chicken);
		
		Fruit apple = new Fruit("apple",1.89,200); 
		Fruit orange = new Fruit("orange",2.36,150); 
		Carbohydrate bread = new Carbohydrate("bread",1,170); 
		Carbohydrate rice = new Carbohydrate("rice",1.25,600); 
		MeatFish chicken = new MeatFish("chicken",5,100); 
		
		System.out.println("\nInput Grocery List ex: 5 apple, 2 bread");
		Scanner keyboard = new Scanner(System.in); 
		input = keyboard.nextLine();
		keyboard.close();
		StringTokenizer myTokens = new StringTokenizer(input," "); 
		 
		while(myTokens.hasMoreTokens())
		{
			quantity = Double.parseDouble(myTokens.nextToken());
			food = myTokens.nextToken(); 
			
			switch(food)
			{
			case "apple":
				totalPrice += (quantity * (apple.getPrice()));
				totalFat += (quantity * (apple.getFat()));
				totalSugar += (quantity * (apple.getSugar())); 
				Apples -= quantity; 
				break; 
			case "orange": 
				totalPrice += (quantity * (orange.getPrice()));
				totalFat += (quantity * (orange.getFat()));
				totalSugar += (quantity * (orange.getSugar())); 
				Oranges -= quantity; 
				break; 
			case "bread":
				totalPrice += (quantity * (bread.getPrice()));
				totalFat += (quantity * (bread.getFat()));
				totalSugar += (quantity * (bread.getSugar()));
				Bread -= quantity; 
				break; 
			case "rice":
				totalPrice += (quantity * (rice.getPrice()));
				totalFat += (quantity * (rice.getFat()));
				totalSugar += (quantity * (rice.getSugar()));
				Rice -= quantity; 
				break;
			case "chicken":
				totalPrice += (quantity * (chicken.getPrice()));
				totalFat += (quantity * (chicken.getFat()));
				totalSugar += (quantity * (chicken.getSugar()));
				Chicken -= quantity; 
				break;
			}
		
			
		}
		System.out.println("Inventory-----");
		System.out.println("Apples " + Apples + " Oranges " + Oranges);
		System.out.println("Loafs of Bread : " + Bread + " KG of Rice " + Rice);
		System.out.println("Kg of Chicken "+ Chicken);
		System.out.println("Total Price " + totalPrice);
		System.out.println("Total Fat " + totalFat);
		System.out.println("Total Sugar " + totalSugar);
		
	}
}
