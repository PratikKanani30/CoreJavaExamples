package collection;

import java.util.jar.Attributes.Name;

import javax.swing.Spring;

class MyException extends Exception

{
		private static int accno[] = { 1001,1002,1003,1004,1005};
		
		private static String name[] = {"Mahesh","Aditi","Panshul","Prince","Pavanbhai"};
		
		private static double bal[] = {1000,20000,30000,40000,50000};
		
	 MyException() {
		
	}

	MyException(String str){
		super(str);
	}

	public static void main(String args[])
	{
		
	
	try{
		
		System.out.println("ACCNo"+"\t"+"Customer"+"\t"+"Balance");
		
		for(int i=0; i<5;i++)
		    {
			
			System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
			if(bal[i]<10000)
			{
				MyException me = new MyException("Balance amount is less");
				throw me;
			}
			}
			
		}
		
	catch (MyException me) {
		me.printStackTrace();
	}
	
    }
}
