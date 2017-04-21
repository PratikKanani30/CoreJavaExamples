import java.util.*;
import java.io.*;


class person1{
	
	
	private String name;
	private int age;
	
	person1(String s,int a)
	{
		
		s = name;
		a = age;
	}	
		
	public void check()
	{
		if (age<=50)
		{
			System.out.println("The person is middle age");
			
		}
		else if(age<=30)
		{
			System.out.println("The person is young");
		}
		else
			System.out.println("The person is aged");
	
		
	}
		
		
		
	}
	
	

public class AgeChecking {
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
			
	person1 p1 = new person1("RAj",33);
		p1.check();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
