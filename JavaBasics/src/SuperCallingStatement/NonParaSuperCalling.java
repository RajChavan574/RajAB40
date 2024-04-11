package SuperCallingStatement;

class Parent_1
{
	Parent_1()
	{
		System.out.println("This is parent constructor");
	}
}
public class NonParaSuperCalling extends Parent_1
{
	NonParaSuperCalling()
	{	super(); 
		System.out.println("This is child constructor");		
	}
	public static void main(String[] args)
	{
		NonParaSuperCalling n1=new NonParaSuperCalling();
	}

}
