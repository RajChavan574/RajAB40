package AbstractAndConcreteClass;

abstract class Collage
{
	abstract void login(); //abstract method 1
	abstract void registration(); //abstract method 2
	
	void method_1() //concrete method
	{
		System.out.println("This is method 1");
	}
}
abstract class Student extends Collage //parent class
{
	abstract void Homepage(); //abstract method 1
	abstract void Careers(); //abstract method 2
	
	void method_2() //concrete method
	{
		System.out.println("This is method 2");
	}
	
}
public class Website extends Student
{
	void method_3() //concrete method
	{
		System.out.println("This is method 3");
	}
	
	void method_4() //concrete method
	{
		System.out.println("This is method 4");
	}

	public static void main(String[] args)
	{
		Website a1=new Website();
		a1.Homepage();
		a1.Careers();
		a1.login();
		a1.registration();
		a1.method_1();
		a1.method_2();
		a1.method_3();
		a1.method_4();
	}

	@Override
	void Homepage() 
	{
		System.out.println("I am homepage");
	}

	@Override
	void Careers() 
	{
		System.out.println("I am careers page");
	}

	@Override
	void login() 
	{
		System.out.println("I am login page");
	}

	@Override
	void registration() 
	{
		System.out.println("I am registration page");
	}
}
