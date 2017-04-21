import java.util.*;
import java.io.*;

public class Transposematrix {
	
	public static void main (String args[]) throws IOException
	{
		Scanner sc =new Scanner (System.in );
		
		System.out.println("Enter the number of Rows and columns");
		
		int r = sc.nextInt();
		int c= sc.nextInt();
		
		
		int arr[][] = new int[r][c];
		
		System.out.println("Enter the elements of matrix");
		
		for(int i=0; i<r; i++)
		for(int j=0; j<c; j++)
			arr[i][j]=sc.nextInt();
		
		System.out.println("Transpose Matrix is:");
		for (int i=0;i<c;i++)
		{ 
			for(int j=0; j<r;j++)
			{
				System.out.println(arr[j][i]+ " ");
			}
			
			System.out.println("\n");
		}
		
		
		
	}
	
	

}
