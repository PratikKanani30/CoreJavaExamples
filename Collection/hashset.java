package collection;

import java.util.*;


public class hashset {
	public static void main(String args[]){
	
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("India");
	hs.add("Pakisthan");
	hs.add("Usa");
	hs.add("Australia");
	hs.add("Nepal");
	
	System.out.println("Hash set = "+ hs);
	
	Iterator it = hs.iterator();
	
	System.out.println("Elements using the Iterator");
	
	while(it.hasNext())
		
	{
		  
		String s =(String)it.next();
		System.out.println(s);
		
		
	}
	
	}
}
