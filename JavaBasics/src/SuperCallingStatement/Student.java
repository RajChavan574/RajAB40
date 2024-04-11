package SuperCallingStatement;
class Mentor
{
	Mentor()
	{
		System.out.println("Mentor Class to help students");
	}
}
public class Student extends Mentor
{
	Student()
	{	super(); //super calling statement is used to called the parent class constructor from the child class constructor.
				//super calling statement will always be the first line of your constructor.
				//super calling statement can be return in two ways implicitly (don't write it) & explicitly (write it).
		System.out.println("Students Class to seek help");		
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
	}

}
