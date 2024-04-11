package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass 
{

	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		l1.add(1234);
		l1.add(7654);
		l1.add(9087);
		l1.add(321);
		l1.add(65);
		l1.add(11);
		//l1.add(null); //it does accept the heterogeneous values.
		//l1.add(null); //it is dynamic in nature
		//l1.add(null); //null you can add it many times
		//l1.add(null);
		l1.add(1234);
		l1.add(1234);
		l1.add(1234); //duplicates you can add it many times.
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
