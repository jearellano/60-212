package assignment7;

public interface FeeCalculator {
	public double computeFees(); //This method calculates the fees that student has to pay.
								//If a concrete class implements this interface,		
								//it must have a definition of this method.
	                            // If an abstract class implements this interface,
	                           // it may either define the method computeFees or defer 
	                           // the definition of the method to one of its subclasses.
	                      
}

