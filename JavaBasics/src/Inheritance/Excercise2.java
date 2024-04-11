package Inheritance;

interface parent1
{
	void login();
	void logout();
}
interface parent2
{
	void registration();
	void logout();
}
public class Excercise2 implements parent1,parent2
{

	public static void main(String[] args) 
	
	{
		Excercise2 e1=new Excercise2();
		e1.login();
		e1.registration();
		e1.logout();

	}

	@Override
	public void registration() 
	{
		System.out.println("Registration Logic");
	}

	@Override
	public void login() 
	{
		System.out.println("Login Logic");
	}

	@Override
	public void logout() 
	{
		System.out.println("Logout Logic");
	}

}
