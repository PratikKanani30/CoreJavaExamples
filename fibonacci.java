
import java.util.*;

public class fibonacci 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many fibonacci value you want ?");
		
		int n = sc.nextInt();
		
		long F1= 0;
		long F2 = 1;
		
		System.out.println(F1);
		System.out.println(F2);
		
		long F = F1+F2;
		System.out.println(F);
		
		
		int count = 3;
		
		while(count<n)
		{
			F1=F2;
			F2= F;
			F = F1+F2;
			System.out.println(F);
			count++;
			
		}
		
		
		
		
		
	}
	
	

}
