package String;

public class String_Function 
{

	public static void main(String[] args) 
	{
		String input ="I am Student";
		boolean answer3=        input.contains("Student");
		System.out.println(answer3);
		String answer1=input.substring(5);
		System.out.println(answer1);
		String input2= input.substring(2,4);
		System.out.println(input2);
	}

}
