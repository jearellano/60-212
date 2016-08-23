package assignment6;

public class tempTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate dateOfEntryToCanada;
		dateOfEntryToCanada = new MyDate("25/05/2009");
		ForeignStudent f1 = new ForeignStudent("Xiao", 3, "China", dateOfEntryToCanada);
		
		System.out.println(f1.findCountry());
		
		
	}

}
