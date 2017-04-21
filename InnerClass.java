import java.io.IOException;
import java.util.*;


class bankAcct
{
	
	 private double bal;
	
	 	bankAcct(double b) 
	 	{
	 		bal =b;
	 	}
	
	 void contact(double r) throws IOException 
	 {
		 System.out.println("Enter your password\n");
		 Scanner sc = new Scanner(System.in);
		 
		 String pass = sc.next();
		
		 
	 if(pass.equals("Vickydada") )
		 {
			 Interest in = new Interest(r);
			 in.calculateinterest();
		 }
	else 
		 {
			 System.out.println("sorry you enter wrong password");
		 }
		 
		 
	 }
	 		 	
private class Interest
{	 		
	 private double rate ;
	 		
	 Interest(double r)
	 	{
			 rate= r;
	    }
	 
	 
	 void calculateinterest()
	 {
		 
		 double interest = (bal*rate)/100;
		 
		 bal += interest;
		 
		 
		 System.out.print("Updated balance\n" +bal);
		 
		 
	  }
	 		
	 		
}
	
	
}
public class InnerClass {
	public static void main (String args[]) throws IOException
	{
		bankAcct acc = new bankAcct(100000);
		acc.contact(9.5);
	}

}
