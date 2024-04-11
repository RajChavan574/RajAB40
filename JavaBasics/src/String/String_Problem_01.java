package String;  //Q. lets take input as your name and lets print your name in vertical fashion.

public class String_Problem_01 
{
	static void printfromreverse()
	{
		String name="Raj Chavan";
		for(int i=name.length()-1;i>=0;i--)
		{
			char a1 = name.charAt(i);
			System.out.println(a1); //it will print vertically
			//System.out.print(a1); //it will print horizontally
		}
	}

	public static void main(String[] args) 
	{
		printfromreverse();
		System.out.println("=================");
		String name="Raj Chavan";
		for(int i=0;i<name.length();i++)
		{
			char a1 = name.charAt(i);
			System.out.println(a1);
		}
	}
}
