import java.util.*;


class person{
	
	String name ;
	int id;
	
	public person(String string, int i) {
		
		this.name=string;
		this.id = i;
		// TODO Auto-generated constructor stub
	}

	void talk()
	{
		System.out.println(" Hello I am "+name);
		System.out.println("My id is "+id);
		
	}
	
	
	
	
	
}
public class hasecodeOfobject {
	public static void main (String args[])
	{
		person Raju = new person("Raju",20);
		
		Raju.talk();
		System.out.println("Hashcode is =" +Raju.hashCode());
	}

}
