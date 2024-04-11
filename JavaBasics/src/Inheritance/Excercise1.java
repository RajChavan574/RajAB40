package Inheritance;

public class Excercise1 
{
	String name;
	int age;
	double salary;
	void student_details(String name, int age, double salary)
	{
		System.out.println("I am "+ name + " and my age is " + age + "and my heavy salary is " + salary);
		this.name=name;
		this.age=age;
		this.salary=salary; //this keyword is used to sign the value local variable to global variable.
							//this keyword should only be use in non-static concept.
	}

	public static void main(String[] args) 
	{
		Excercise1 e1=new Excercise1();
		e1.student_details("Raj",21,25000.20);
		System.out.println(e1.name); //null <- default values
		System.out.println(e1.age); //0
		System.out.println(e1.salary); //0.0
	}
}
