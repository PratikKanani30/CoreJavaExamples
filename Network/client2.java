package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/* create a client which first connects to a server then starts the communicaton by 
 * sending a string to the server.The server sends response to the client .
 * when exit is type at client side the program terminates
 * 
 */

public class client2 {
	public static void main(String args[]) throws  IOException{
		
		Socket s = new Socket("Local host", 888);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(s.getInputStream());
		Scanner kb = new Scanner(System.in);
		
String str , Str1;

while(!(str = kb.nextLine()).equals("Exit"))
{
	dos.writeBytes(str+"\n");
	Str1 = sc.nextLine();
	System.out.println(Str1);
	


}
		
		dos.close();
		sc.close();
		kb.close();
		s.close();
		
		
	}

}
