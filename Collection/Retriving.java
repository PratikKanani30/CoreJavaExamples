package collection;

import java.io.*;
import java.util.*;

class Employee{
	
	int id;
	String name;
	
	public Employee(int i, String n) {
		
		id = i;
		name =n;
		
		
	}
	void displayData()
	{   
		
		System.out.println(id+"\t"+name);;
	}
	
}


public class Retriving {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Employee arr[] = new Employee[5];
		
		for(int i =0;i<5;i++)
		{
			System.out.println("Enter the ID");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the name");
			
			String name = sc.nextLine();
			
			arr[i] = new Employee(id, name);
			
		}
		
		
		System.out.println("The Employee data is:");
		
		for(int i =0;i<arr.length;i++){
			
			arr[i].displayData();
		}
		
	}

}
