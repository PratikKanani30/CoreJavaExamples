package Network;
import java.net.*;
public class Url {

	public static void main(String args[]) throws MalformedURLException
	{
		
		URL obj = new URL("https://www.facebook.com/?stype=lo&jlou=AfdfAT891xDphHbK8zfhykvQCzATw6zCWWQjc0ih8mm4ne-5UVZsnvh0MdIREbuKd9NVrzDef4HBO0eEzLO5T2HB2wXbZ9mv1j1k41RXsYqkfA&smuh=54720&lh=Ac_B4uH6rY4_qwv4");
		
	System.out.println(" protocol " +obj.getProtocol());
	System.out.println("Host " +obj.getHost()) ;
	System.out.println("path "+obj.getPath());
	System.out.println("Port "+obj.getPort());
	System.out.println("Authority "+obj.getAuthority());
	System.out.println("Default port "+obj.getDefaultPort());
	
	
	
	
	}
}
