package Assignments; //Assignment -18 Find out future time in 10days

import java.util.Date;

public class Assignment_18 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		d1.getTime();
		//d1.getDate();  //depreciation
		System.out.println(d1.getTime()); //machine time
		Date d2=new Date(d1.getTime()); //human time
		System.out.println(d2);
		String currenttime=d2.toString();
		Date futuretime=new Date(d1.getTime()+(1000*60*60*24*10)); //human time
		System.out.println(futuretime);

	}

}
