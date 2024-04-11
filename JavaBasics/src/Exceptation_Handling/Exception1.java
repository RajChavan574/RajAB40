package Exceptation_Handling;

public class Exception1 {

	public static void main(String[] args) 
	{
		try 
		{
			int c=1/1;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have handled one exception called AE");
		}
	}
}
//1.
//2.exception handling in java should be done in try & catch block.
//3.where ever the exception coming or which ever line given exception should be under try block.
//4.and it be must be handled in side the catch block.
//5.writing try and catch block does not mean that exception will occur always.
//6.in case exception occurs then try block will not execute and catch block will execute.
//7.in case exception does not occurs then try block will execute and catch block will not execute.
//8.for every try you can always have one catch or multiple catches.
//Syntax 
/*try {
		catch (ExceptionName refvariable)
		{
		
		}
		catch (ExceptionName2 refvariabl)
		{
		
		}*/
