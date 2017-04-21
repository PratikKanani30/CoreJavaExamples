import java.io.*;
import java.util.*;


public class Bubblesort 
{
	public static void main(String args[])
	{
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element");
		int n = sc.nextInt();
		arr= new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter int:");
		
				arr[i] = sc.nextInt();
		}
		
		int limit = n-1;
		boolean flag = false;
		int temp;
		
		for(int i=0; i<limit;i++)
		{
				for(int j=0; j<limit -i; j++)
				{ 
					// swap
					if(arr[j] > arr[j+1] )
					{
						temp =arr[j];
						arr[j]=arr[j+1];
						arr[j+1] = temp;
						flag =true;
					}		
					
					
				}		
				if(flag==false)
					break;
				else
					flag = false;
				
		}
		
	    System.out.println("Sorted Array is");
	    for(int i=0; i<n; i++)
	    {
	    	 System.out.println(arr[i]);
	    } 	
	    }
	}


