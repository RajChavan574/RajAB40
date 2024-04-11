package Interface;
interface Google_Authentication
{
	void login();
	void registration();
}
public class Raj01 implements Google_Authentication 
{
	static void methodname()
	{
		
	}

	public static void main(String[] args) 
	{
		methodname();
		Raj01 r1=new Raj01();
		r1.login();
		r1.registration();
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
