package JavaProgram; // global variable - i)any variable that is declare out side any method but within a class is known as global variable. 
					 //ii) the scope of the globe variable is beginning of the class to end of the class.
					 //iii) global variable can be declare & initialize in single line but not in two lines.
public class GlobalVariable 
{
	int a=100;// you have to access it in the same fashion how u accessed the non-static method.
	static double pi=3.14;
	public static void main(String[] args) 
	{
		System.out.println(pi);
		GlobalVariable g1= new GlobalVariable();
		g1.a=200;
		System.out.println(g1.a);
	}

}
