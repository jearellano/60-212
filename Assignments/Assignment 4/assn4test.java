package assignment4;

public class assn4test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager("Robert William Hunter", "23/10/2005", 35000.00);
		NewWorker w1 = new NewWorker("John Smith", "15/11/2005", 25000.00);
		NewWorker w2 = new NewWorker("Jessica Chowhan", "21/01/2006", 30000.00);
		m1.addWorker(w1);
		m1.addWorker(w2);
		
		
		System.out.println(m1.toString());
		
		
		
		
		
	}

}
