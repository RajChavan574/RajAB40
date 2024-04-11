package Interface;

interface Google_Authent 
{
	void login();
	void registration();

}
public class Interface implements Google_Authent
{
	static void methodname()
	{
		
	}
	public static void main (String[]args)
	{
		methodname();
		Interface m1=new Interface();
		m1.login();
		m1.registration();
	}
	@Override
	public void login() 
	{
		System.out.println("Login logic");
	}
	@Override
	public void registration() 
	{
		System.out.println("Login registration");
	}
	
}
