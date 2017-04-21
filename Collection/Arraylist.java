package collection;
import java.util.*;

import java.io.*;


public class Arraylist {
	public static void main (String args[])
	{
		
		ArrayList<String> arl = new ArrayList<String>();
 		arl.add("Apple");
 		arl.add("Orange");
 		arl.add("Grapes");
 		arl.add("CasturdApple");
 		arl.add("Mango");
 		
 		
 		System.out.println("Contents" +arl);
 		
 		arl.remove(1);
 		System.out.println("After removing Contents" +arl);
 		System.out.println("After removing Contents " +arl.size());
 		
 		
 		System.out.println("Extracting Iterator");
 		Iterator it = arl.iterator();
 		
 		while(it.hasNext()){
 			
 			System.out.println(it.next());
 		}
 		 
		
		
		
	}

}
