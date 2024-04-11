package TypeCasting; //Q. lets convert the weight which is 45.83 into int data type. 

public class PrimitiveTypeCasting2 
{

	public static void main(String[] args) 
	{
		double weight = 83;
		System.out.println(weight); //implicit -- primitive
		
		double weight1 = (double)83;
		System.out.println(weight1); //explicit -- primitive
		
		int a1= (int)83.65; //narrowing -- Explicit
		System.out.println(a1);
	}

}
