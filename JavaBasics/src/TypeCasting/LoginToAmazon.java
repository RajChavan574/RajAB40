package TypeCasting;

class Dataprovider
{
	void username()
	{
		System.out.println("Raj");
	}
	void password()
	{
		System.out.println("962434");
	}
}

public class LoginToAmazon extends Dataprovider
{
	void login_button()
	{
		System.out.println("Press the button");
	}

	public static void main(String[] args) 
	{
		Dataprovider d1 = new LoginToAmazon(); //upcasting
		d1.username();
		d1.password();
		//LoginToAmazon a2= (LoginToAmazon) d1; //downcasting-explicit
		//a2.username();
		//a2.password();
		//a2.login_button();

	}

}
