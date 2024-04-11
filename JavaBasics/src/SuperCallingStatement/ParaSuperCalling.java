package SuperCallingStatement;

class Parent_2
{
	Parent_2(String a)
	{
		System.out.println("This is parent constructor");
	}
}
public class ParaSuperCalling extends Parent_2
{
	ParaSuperCalling()
	{	super("Raj"); 
		System.out.println("This is child constructor");		
	}
	public static void main(String[] args)
	{
		ParaSuperCalling n1=new ParaSuperCalling();
	}

}
