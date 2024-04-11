package Interface;

interface Three
{
	void method3();
	void method4();
}
abstract class ClassTwo implements Three
{
	abstract void method1();
	abstract void method2();
	static void add()
	{
		
	}
}

public class ClassOne extends ClassTwo
{

	public static void main(String[] args) 
	{
		ClassOne c1=new ClassOne();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();

	}

	@Override
	public void method3() 
	{
		System.out.println("I am method 3");
		
	}

	@Override
	public void method4() 
	{
		System.out.println("I am method 4");
		
	}

	@Override
	void method1() 
	{
		System.out.println("I am method 1");
		
	}

	@Override
	void method2() 
	{
		System.out.println("I am method 2");
		
	}

}
