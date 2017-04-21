
package collection;

import java.io.*;
import java.util.*;


public class Stackdemo {
	
	public static void main(String args)
	{
		
		
		Stack<Integer> st = new Stack<Integer>();
		
		int choice = 0;
		
		int position,element;
		Scanner sc = new Scanner(System.in);
		
		while(choice<4){
			
			
			System.out.println("Stack operations");
			System.out.println("1 push an element");
			System.out.println("2 pop an element");
			System.out.println("3 search an element");
			System.out.println("4 Exit");
			System.out.println("Your Choice");
			
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1: System.out.println("Enter a Element");
			
			element = Integer.parseInt(sc.nextLine());
			
			st.push(element);
			break;
			
			case 2 :  Integer obj = st.pop();
			System.out.println("popped = " +obj);
			break;
			
			case 3:
				System.out.println("Which element ?");
				
				element = Integer.parseInt(sc.nextLine());
				position = st.search(element);
				if(position == -1){
					
					System.out.println("Element not found");
					}
				else
					System.out.println("Position" + position);
				break;
				default:
					return;
			
			}
			
			System.out.println("Stack contents: " +st);
			
			}
		}
}
