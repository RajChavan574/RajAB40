package String;  //Q. take a name as a input and replace all the capital letter with "Manish".

public class String_Problem_06 
{
	public static void main(String[] args) 
	{
		String name="i am RAJ 123456";
		String output= name.replace('a', ' ');
		System.out.println(output);
		
		System.out.println(name.replace('a','n'));
		
		System.out.println(name.replaceAll("[A-Z]", " "));
		
		System.out.println(name.replaceAll("[0-9]", " "));
		
		System.out.println(name.replaceAll("[A-Z]","Manish"));
		
		String name1="";
		System.out.println(name.isEmpty());
		System.out.println(name1.isEmpty()); //isEmpty
		
		System.out.println(name.lastIndexOf('a')); // it will calculate the last index of given character.
		System.out.println(name.equalsIgnoreCase("i am RAJ 123456"));
		System.out.println(name.repeat(5)); // it will repeat the given string for 5 times.
		String name2="Raj";
		System.out.println(name2.toCharArray());

	}

}
