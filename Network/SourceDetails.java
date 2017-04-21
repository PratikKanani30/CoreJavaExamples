package Network;
import java.net.*;
import java.sql.Date;
import java.io.*;
import java.util.*;

public class SourceDetails {
	
	public static void main(String args[]) throws IOException{
		System.out.println("Enter the URL ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		URL obj = new URL(str);
		URLConnection conn = obj.openConnection();
		
      System.out.println("Date: " +new Date(conn.getDate()));
      System.out.println("Content type :" +conn.getExpiration());
      
      System.out.println("Last modifiedDate: " +new Date(conn.getLastModified()));
      int l = conn.getContentLength();
      System.out.println("Lenght of content : " +l);
      
      if(l==0)
      {
    	   System.out.println("Content not available");
    	   return;
       }
      
      else
      {
    	  int ch;
    	  InputStream  in =  conn.getInputStream();
    	  while((ch = in.read())!= -1);
    	  System.out.println((char)ch);
    	  
      }
      
		
		
		
		
		
		
	}

}
