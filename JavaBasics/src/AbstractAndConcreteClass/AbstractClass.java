package AbstractAndConcreteClass;
abstract class Google_Code
{
	abstract void login();
	abstract void registartion();
}

public class AbstractClass extends  Google_Code
{

	public static void main(String[] args) 
	{
		AbstractClass a1=new AbstractClass();
		a1.login();
		a1.registartion();	
	}
	void login() 
	{
		System.out.println("Login Logic");
	}
	void registartion() 
	{
		System.out.println("registartion Logic");
	}

}
