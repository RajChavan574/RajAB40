package String; //Q. Create a array of length 4 and check the given number 6 is present in the array or not.

public class Array_Exersies 
{

	public static void main(String[] args) 
	{
		int[] num ={15,60,23,44};
		
		int checkNumber= 6; //number to check is 6
		
		
		boolean isPresent =checkNumberInArray(num,checkNumber); 
		
		if(isPresent) 
		{
			System.out.println(checkNumber + " is present in the array");	
		}
		else
		{
			System.out.println(checkNumber + " is not prsent in the array");
		}
	}

	public static boolean checkNumberInArray(int[] arr, int num) 
	{
		for (int i=0; i < arr.length; i++) {
			if (arr[i]==num) {
				return true;
			}
		}
		return false;
	}
}
