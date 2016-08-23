package lab10;

public class DivideByZeroException extends ArithmeticException {
	public DivideByZeroException()
	{
		super("Try to Calc average with no Numbers"); 
	}
}
