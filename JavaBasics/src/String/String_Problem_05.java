package String; //Q. in the given string replace all the numerics.

public class String_Problem_05 
{

	public static void main(String[] args) 
	{
		String name="I am Student 123456";
		String output= name.replace('a', ' ');
		System.out.println(output);
		
		System.out.println(name.replace('a','n'));
		
		System.out.println(name.replaceAll("[A-Z]", " "));
		
		System.out.println(name.replaceAll("[0-9]", " "));

	}

}

