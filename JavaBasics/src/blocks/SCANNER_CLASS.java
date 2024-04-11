package blocks; //SCANNER CLASS IS PREDEFINED CLASS IN JAVA. // IT IS ONE OF A CLASS WHICH IS FINAL IN NATURE.
															//SCANNER CLASS USE TO TAKE A HUMAN INPUT @ RUN TIME.
import java.util.Scanner;
//* mean -> IT mean all
//import java.util.Scanner;

public class SCANNER_CLASS 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first no->");
		int firstno=     s1.nextInt();
		System.out.println("Enter the second no->");
		int secondno=    s1.nextInt();
		int sum=firstno + secondno;
		System.out.println("The addition of the 2 number is ->" +sum);
		

	}

}

/*what are the methods we have under scanner class ? --> 
 
 nextint();,next byte();,nextshort();, nextlong();,nextfloat();,nextdouble();, next bolean*/

/* lets declare and initialize all the methods that we have under scanner class. */
