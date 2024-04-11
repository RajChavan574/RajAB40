package blocks;   //Q. in a class you have 5 SIB how the order of execution will be ? ans - sequentily 
					//IIB - INSTANCE INITILIZATION BLOCK
public class IIB_CLASS 
{
	{
		System.out.println("IIB");
	}
	
	{
		System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	{
		System.out.println("IIB 3");
	}
	
	{
		System.out.println("IIB 4");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		IIB_CLASS v1= new IIB_CLASS();

	}

}

//Q. what is the order of the execution between your main method , sib & iib & Constructor ?

