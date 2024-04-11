package Access_Specifier;

public class AccessSpecifierMethods 
{
	private void m1()
	{
		System.out.println(1);
	}
	private void m2()
	{
		System.out.println(2);
	}
	private void m3()
	{
		System.out.println(3);
	}
	private void m4()
	{
		System.out.println(4);
	}

	public static void main(String[] args) 
	{
		AccessSpecifierMethods a1=new AccessSpecifierMethods();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
	}

}
