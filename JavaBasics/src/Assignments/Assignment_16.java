package Assignments; //Assignment-16 Create Multi level Inheritance using 2 Abstract classes and 1 concrete class by creating 2 AbsMethods in Absclass1,
					//creating 2 AbsMethods, 1 ConcreteMethod in Abssclass2, and 2 Concrete methods in Child class(Concrete class)

abstract class abs_class1 //abstract class 1
{
	abstract void add(); //abstract method 1
	abstract void substract(); //abstract method 2
}
abstract class abs_class2 extends abs_class1 //abstract class 2
{
	abstract void multiple(); //abstract method 3
	
	void divide() // Concrete method
	{
		System.out.println(Math.floorDiv(100, 200));
	}
}
public class Assignment_16 extends abs_class2
{
	void modulus()
	{
		System.out.println(Math.floorMod(100, 200));
	}
	public static void main(String[] args) 
	{
		Assignment_16 a1=new Assignment_16();
		a1.add();
		a1.substract();
		a1.multiple();
		a1.divide();
		a1.modulus();
	}

	@Override
	void multiple() 
	{
		System.out.println(Math.multiplyExact(100, 200));	
	}

	@Override
	void divide() 
	{
		System.out.println(Math.floorDiv(100, 200));
	}

	@Override
	void add() 
	{
		System.out.println(Math.addExact(100, 200));
	}

	@Override
	void substract() 
	{
		System.out.println(Math.subtractExact(100, 200));
	}
}
