import java.util.Scanner;

class check
{
	
void swap(int num1,int num2)
{
	
	int temp;
	
	temp=num1;
	num1=num2;
	num2 =temp;
	
	}


}
public class swappro {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value\n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		check c = new check();
		System.out.println( num1+"\t"+num2);
		
		
		c.swap(num1, num2);
		System.out.println( num1+"\t"+num2);
		// pass by value hence the value remain same
	}

}
