
import java.io.*;
import java.util.Scanner;




class Employee
{
	int id;
	String name;

Employee(int i ,String n)
{
	
id = i;
name =n;
}

void Displaydata()
{

	
	System.out.println(id+"\t" +name);
}

}

public class Group {
	public static void main (String args[])
	{
		
	Scanner sc = new Scanner (System.in);
	Employee arr[] = new Employee[5];
	
	
	for(int i=0; i<5; i++)
	{
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name =sc.next();
		
		arr[i] = new Employee(id,name);
		
	}
	System.out.println("\n Employee data is;");
	
	for (int i=0; i<5; i++)
	{
		
		arr[i].Displaydata();
	}
	
	
}}
