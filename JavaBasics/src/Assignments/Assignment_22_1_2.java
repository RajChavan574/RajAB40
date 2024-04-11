package Assignments; //Array Problem - 2

import java.util.Arrays;

public class Assignment_22_1_2 
{

	public static void main(String[] args) 
	{
		int Roll_No[]= {1,2,3,4,5};
		String Student_Name[] = {"Kushal", "Kushal Prasad", "Vishal Prasad", "Monica Rawat", "Kushagra Verma"};
        String Gender[] = {"M", "M", "M", "F", "M"};
        String Mobile_Number[] = {"968574", "857412", "857421", "968521", "967452"};
		
		
        System.out.print("Student Name\t");
        for (String name : Student_Name) 
        {
            System.out.print(name + "\t");
        }
        
        System.out.println();
        System.out.print("Gender\t\t");
        for (String gender : Gender) 
        {
            System.out.print(gender + "\t\t");
        }
        
        System.out.println();
        System.out.print("Mobile Number\t");
        for (String mobile : Mobile_Number) 
        {
            System.out.print(mobile + "\t\t");
        }
        
        System.out.println();
        System.out.print("Roll No\t\t");
        for (int roll : Roll_No) 
        {
            System.out.print(roll + "\t\t");
		}
	}
}

	