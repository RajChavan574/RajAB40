package Collection;

import java.util.ArrayList;


public class CollectionMethods 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Suraj");
		a1.add("Moon");
		a1.add("Water");
		a1.remove("Water");  //remove
		System.out.println(a1);
		System.out.println(a1.isEmpty()); //isEmpty
		a1.clear();
		//System.out.println(a1.contains("Raj")); //contains
		System.out.println(a1);
		
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1); //AddAll
		System.out.println(a2);
		a2.add("Air");
		a2.add("Rock");
		a2.removeAll(a1); //removeAll
		System.out.println(a2.size()); //size
		System.out.println(a2);
		System.out.println(a2.containsAll(a2)); //containsAll

	}

}
