import java.util.*;
public class Positive 
{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Number is positive");
			
		}
		else if (a<0)
		{
			System.out.println("Number is number is negative");
			
		}
		else
			System.out.println("Number is neither positive or negative");
	}

}
