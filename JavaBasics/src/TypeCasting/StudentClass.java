package TypeCasting; //Q. create a class as student and upcast that a object class.

class Student2
{
	void name()
	{
		System.out.println("Raj");
	}
}
class Student3 extends Student2
{
	void surname()
	{
		System.out.println("Chavan");
	}
}

public class StudentClass extends Student3
{
	void MidName()
	{
		System.out.println("Ajay");
	}

	public static void main(String[] args) 
	{
		Student3 s1 = new StudentClass();
		s1.name();
		s1.surname();
		
		StudentClass s2= (StudentClass)s1;
		s2.name();
		s2.surname();
		s2.MidName();
		
	}
}
