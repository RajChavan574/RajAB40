package Encapsulation; //getter & setter method
class login
{
	private String email_id="contact@grotechminds.com";//defalut email id of the system with my customer email id
	public String getEmail_id()
	{
		return email_id;
	}
	public void setEmail_id(String email_id)//local variable
	{
		this.email_id=email_id;
	}
	private String password="contact@password.com";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private int age=18;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private double my_weight =50.90;
	public double getMy_weight() {
		return my_weight;
	}
	public void setMy_weight(double my_weight) {
		this.my_weight = my_weight;
	}
	
}
public class Encapsulation 
{

	public static void main(String[] args) 
	{
		login l1=new login();
		l1.setEmail_id("vijay@gmail.com");
		System.out.println(l1.getEmail_id());
		
		l1.setPassword("vijay@password");
		System.out.println(l1.getPassword());
		
		l1.setAge(24);
		System.out.println(l1.getAge());
		
		l1.setMy_weight(60.50);
		System.out.println(l1.getMy_weight());
	}

}
