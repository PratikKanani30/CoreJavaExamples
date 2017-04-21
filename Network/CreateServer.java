package Network;
import java.io.*;
import java.net.*;


public class CreateServer {
	public static void main(String args[]) throws IOException{
		
		ServerSocket ss = new ServerSocket(777);
		
		Socket s = ss.accept();
		System.out.println("Connection Established");
		OutputStream obj = s.getOutputStream();
		
		PrintStream ps = new PrintStream(obj);
		
		String str = "Hello client";
		ps.println(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
		
		
	}

}
