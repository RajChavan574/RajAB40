package String;

public class ReplaceFunction 
{

	public static void main(String[] args) 
	{
		String name ="I am student";
		String output=     name.replace('a',' ');
		System.out.println(output);
		
		System.out.println(name.replace('a','n')); //replace
		
		System.out.println(name.replaceAll("[A-Z]"," ")); //replace all
		System.out.println(name.replaceAll("[A-Z]"," "));
		String name1= "Hey I am Fin9";
		System.out.println(name1.replaceAll("[0,9]"," "));
		String name2= " ";
		System.out.println(name.isEmpty()); //IsEmpty
		System.out.println(name2.isEmpty());
		System.out.println(name.lastIndexOf('a')); //LastIndexOf
		System.out.println(name.equalsIgnoreCase("i am student"));//EqualsIngnoreCase
		System.out.println(name.repeat(5)); //repeat
		String name3=" ";
		System.out.println(name3.toCharArray()); //toCharArray
		
	}

}
//Q.in the given string replace all the capital letters.
//Q.replace all the smaller letters in the given string.
//Q. in the given string replace all the numerics.
//Q. take your name as a input and replace capital letter in your name with manish.
//Array :- homogeneous values and fixed size