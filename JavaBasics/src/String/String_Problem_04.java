package String; //Q. in the given string remove all the capital letters.

public class String_Problem_04 
{

	public static void main(String[] args) 
	{
		String name="I am Student";
		String output= name.replace('a', ' ');
		System.out.println(output);
		
		System.out.println(name.replace('a','n'));
		
		System.out.println(name.replaceAll("[A-Z]", " "));

	}

}
