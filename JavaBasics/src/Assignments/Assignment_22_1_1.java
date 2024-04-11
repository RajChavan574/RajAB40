package Assignments; //Array Problem - 1

import java.util.Arrays;

public class Assignment_22_1_1 
{

	public static void main(String[] args) 
	{
		int Roll_No[]=new int [5];
		Roll_No[0]=1;
		Roll_No[1]=2;
		Roll_No[2]=3;
		Roll_No[3]=4;
		Roll_No[4]=5;
		
		String Student_Name[]=new String[5];
		Student_Name[0]="Kushal  ";
		Student_Name[1]="Kushal P";
		Student_Name[2]="Vishal Prasad";
		Student_Name[3]="Monica Rawat";
		Student_Name[4]="Kushagra Verma";
		
		String Gender[]=new String[5];
		Gender[0]="M";
		Gender[1]="M";
		Gender[2]="M";
		Gender[3]="F";
		Gender[4]="M";
		
		String Mobile_Number[]=new String [5];
		Mobile_Number[0]="968574";
		Mobile_Number[1]="857412";
		Mobile_Number[2]="857421";
		Mobile_Number[3]="968521";
		Mobile_Number[4]="967452";
		
		System.out.println("Roll No\tStudent Name\tGender\tMobile Number");
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Roll_No[i] + "\t" + Student_Name[i] + "\t" + Gender[i]+ "\t" + Mobile_Number[i]);
			}
		}
	}


