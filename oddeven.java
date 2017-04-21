import java.util.*;


public class oddeven {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		//int n = sc.nextInt();
		
		for(int i =1; i<15; i++)
		{
			int n = sc.nextInt();
		
		if( n%2 == 0 && n!=0)
		{
			System.out.println("Number is even");
			
		}
		else if (n==0)
		{
			System.out.println("Number is neither odd or even");
			
		}
			
		
		else 
			
			System.out.println("Number is odd");
		}
	}

}
