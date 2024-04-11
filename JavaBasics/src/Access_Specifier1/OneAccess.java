package Access_Specifier1;

public class OneAccess {
	private void m1()
	{
		System.out.println(1);
	}
	protected void m2()
	{
		System.out.println(2);
	}
	public void m3()
	{
		System.out.println(3);
	}
	void m4()
	{
		System.out.println(4);
	}
	public static void main(String []args)
	{
		OneAccess a1 = new OneAccess();
	}

}
