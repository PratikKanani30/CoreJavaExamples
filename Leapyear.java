import java.util.*;



public class Leapyear 
{
	public static void main(String args[])
	{
		System.out.println("Enter the year");
		
		Scanner sc = new  Scanner(System.in);
		int a =sc.nextInt();
		
 
		
		if(a % 100 ==0 && a % 400 == 0)
		
			System.out.println("This is leap year");
		
		else if(a % 100 !=0 && a % 4 == 0)
			
			System.out.println("This is leap year");
		else
			System.out.println("This is not leap year");


	}
	


}
