package String;

public class Class_String {

	public static void main(String[] args) 
	{
		String name = "Raj";
		int size = name.length();
		System.out.println(size);
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('j'));
		System.out.println("Raj".equals("Raj"));
		System.out.println(name.equals("raj"));
	}
}
//in the given string remove the "A" presence.
