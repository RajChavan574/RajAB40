package AbstractAndConcreteClass;
abstract class Facebook_class
{
	void add() //Concrete method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void substract() //Concrete method 2
	{
		System.out.println(Math.subtractExact(10, 20));
	}
	abstract void multiple(); //abstract method 1
	abstract void divide(); //abstract method 2
}

public class Abstract_Class extends Facebook_class
{
	void modulus()
	{
		System.out.println(Math.floorMod(10, 20));
	}
	public static void main(String[] args) 
	{
		Abstract_Class a1 =new Abstract_Class();
		a1.add();
		a1.substract();
		a1.modulus();
		a1.multiple();
		a1.divide();
	}
	@Override
	void multiple() 
	{
		System.out.println(Math.multiplyExact(10, 20));
	}
	@Override
	void divide() 
	{
		System.out.println(Math.floorDiv(10, 20));
	}

}

