package Inheritance;
class State_Class
{
	static void multiple()
	{
		System.out.println("multiply");
	}
	
void division()
{
	System.out.println("dividing");	
}
}
public class CityClass extends State_Class
{
	static void add()
	{
		System.out.println("adding");
	}
	static void subtracting()
	{
		System.out.println("subtracting");
	}
	
	public static void main(String[] args) 
	{
		add();
		multiple();
		CityClass c1 = new CityClass();
		c1.subtracting();
		c1.division();
	}
}
