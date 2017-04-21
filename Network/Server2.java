package Network;
//create a server such that the server receive data from the client using scanner and then send reply to client
import java.util.*;
import java.io.*;
import java.net.*;



public class Server2 {
	public static void main(String args[]) throws IOException
	{
		
		ServerSocket ss = new ServerSocket(888);
		
		Socket s = ss.accept();
		System.out.println("Connection Established");
		
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		Scanner sc = new Scanner(s.getInputStream());
		
		Scanner kb = new Scanner(System.in);
		
		while(true){
			
			String str,str1;
			
			while((str = sc.nextLine()) !=null)
       {
	System.out.println(str);
	str1 = kb.nextLine();
	ps.println(str1);
       
       
       }
			ps.close();
			sc.close();
			kb.close();
			ss.close();
			s.close();
			System.exit(0);
		}
		
	}

}
