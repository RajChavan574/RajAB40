package TypeCasting;

class GrandParentClass
{
	void add()
	{
		
	}
}
class ParentClass extends GrandParentClass
{
	void sub()
	{
		
	}
}

public class ChildClass1 extends ParentClass
{
	void mul()
	{
		
	}

	public static void main(String[] args) 
	{
		ParentClass p1 = new ChildClass1(); //upcasting
		p1.add();
		p1.sub();
		
		ChildClass1 c1= (ChildClass1) p1;
	}

}
