package JavaProgram;
abstract class Google_Code
{
	abstract	void login();
	abstract void registartion();
}

public class Abstract_Classs extends  Google_Code
{

	public static void main(String[] args) 
	{
		Abstract_Classs a1=new Abstract_Classs();
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
