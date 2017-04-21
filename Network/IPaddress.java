package Network;

import java.io.*;
import java.net.*;
import java.util.*;


public class IPaddress {
	public static void main(String args[] ) throws IOException
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the website name");
		
		String site =Sc.nextLine();
		
		try{
			
			InetAddress ip = InetAddress.getByName(site);
			System.out.println("The Website name is  :"+ip);
			
			}
		catch(UnknownHostException ae)
		{
			System.out.println("Website not found");
			
		}
	}

}
