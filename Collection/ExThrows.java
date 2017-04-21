package collection;
import java.io.*;
import java.util.*;


class Simple {
	
	private String name ;
	
	void accept()
	{
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter name:");
		 name = sc.next();
		
		
	}
	 void display()
	 {
		 System.out.println("Name :" +name);
	 }
	
}


public class ExThrows {
	public static void main(String args[]){
		
		Simple s = new Simple();
		s.accept();
		s.display();
		
		
	}
}
