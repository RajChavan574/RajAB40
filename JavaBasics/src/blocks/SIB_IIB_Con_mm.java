package blocks;

public class SIB_IIB_Con_mm 

{
	static //SIB
	{
		System.out.println("I am SIB");
	}
	
	{//IIB
		System.out.println("I am IIB");
	}
	
	SIB_IIB_Con_mm()//constructor
	{
		System.out.println("I am Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("I am your Main method i.e. heart");
		SIB_IIB_Con_mm s1= new SIB_IIB_Con_mm();
		
		System.out.println("One more Object");
		SIB_IIB_Con_mm S2= new SIB_IIB_Con_mm();
	}

}

