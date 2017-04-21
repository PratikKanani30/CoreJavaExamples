package collection;

import java.util.*;
import java.io.*;

public class HashmapTableDemo {

	public static void main (String args[]){
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put("Ajay", 60);
		ht.put("Mahesh", 20);
		ht.put("Pankaj", 90);
		ht.put("Kruti", 100);
		ht.put("akash", 110);
		
		System.out.println("Name of the players");
		Enumeration e = ht.keys();
		
		while(e.hasMoreElements())
		System.out.println(e.nextElement());
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the name of player");
		String name = sc.nextLine();
		
		name = name.trim();
		Integer score = ht.get(name);
		if(score != null)
			{
			int sco = score.intValue();
			System.out.println(name+" Score "+sco);
			
			}
		
		
		else
			System.out.println("Player not found");
		
	}
}
