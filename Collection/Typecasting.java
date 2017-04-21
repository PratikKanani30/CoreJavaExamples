package collection;

import java.io.*;
import java.util.*;

public class Typecasting {
	
	public static void main(String args[]){
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		String a = sc.nextLine();
		//convert string into into
		
		
		int i = Integer.parseInt(a);
		
		System.out.println("In decimal:" +i);
		
		// covert int to other system
		
		a = Integer.toBinaryString(i);
		System.out.println("In binary " +a);
		
	}

}
