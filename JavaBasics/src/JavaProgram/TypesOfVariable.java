package JavaProgram; // variable is three types in java local, global, final.
					 // 1. local - i)any variable that is declared under any method is know as local variable. 
					 //ii)scope of the local variable only from the beginning of the method till the end of the method.
					 //iii) int a; // declaration of variable   a = 100 // Initialization OR int a = 100;
					 //iv) local variable can not be utilize until & unless it is not initialized.
					 //v) any local variable dosn't have default value.
					 //vi) local variable can't be distinguish between static and non-static variable.

public class TypesOfVariable 
{
	int b=1000; // global variable
	void add()
	{
		int a=100; // local variable
		int z;
	}
	void substract()
	{
		int b=200; // local variable
	}
	void multiply()
	{
		String a;
		a="My Name Is Raj";// local variable
	}
	static void div (String a, boolean b)
	{
		
	}

	public static void main(String[] args) 
	{
		

	}

}
