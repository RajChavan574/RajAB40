package String;

public class Concatination 
{

	public static void main(String[] args) 
	{
		String input ="I am Student";
		boolean answer3=        input.contains("am");
		System.out.println(answer3);
		String answer1=input.substring(5);
		System.out.println(answer1);
		String input2= input.substring(2,4);
		System.out.println(input2);
		System.out.println(input.concat(" Raj "));
		System.out.println();
		System.out.println();

	}

}
