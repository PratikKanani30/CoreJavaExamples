import java.util.*;

public class SearchString {
	public static void main (String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("How many cities ??");
		int n = sc.nextInt();
		String arr[] = new String[n];
		
	for(int i=0; i<n; i++)
		{
			System.out.println("Enter the name of the cities");
			arr[i] = sc.next();
		
		}
			System.out.println("Enter the name of the search city");
			String Search = sc.next();
	
	boolean found = false;
	
	for(int i=0; i<n; i++)
	{
		if(Search.equalsIgnoreCase(arr[i]))
		{
			System.out.println("City found at position:" +(i+1));
			found = true;
		}
	

	}
	
	
	if(!found)
		System.out.println("City is not in list");
	
	
	
	}

}
