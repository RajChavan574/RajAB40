package TypeCasting; //Q.lets convert your weight which is 83 into double data type.

public class PrimitiveTypeCasting1 
{

	public static void main(String[] args) 
	{
		double weight = 83;
		System.out.println(weight); //implicit
		
		double weight1 = (double)83;
		System.out.println(weight1); //explicit

	}

}
