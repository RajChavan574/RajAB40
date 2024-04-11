package Collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionClassSet 
{

	public static void main(String[] args) 
	{
		Set s1=new TreeSet();
		s1.add(1234);
		s1.add(765);
		s1.add(9876);
		s1.add(981);
		s1.add(22);
		s1.add(45);  //hashcode Value
		s1.add(1234);
		s1.add(1234);
		//s1.add(null);
		System.out.println(s1);

	}

}
