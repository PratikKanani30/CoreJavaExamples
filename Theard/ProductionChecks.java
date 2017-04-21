package Theard;



class producer extends Thread
	{
		StringBuffer sb;
		boolean proover = false;
		producer(){
		sb = new StringBuffer();
	
}

		public void run(){
		for(int i = 1; i<10; i++)
		{	
			try
			{
				sb.append( i+":");
				sleep(100);
				System.out.println("Appending"); 
			}
			catch(Exception e){}
			proover = true;
			}
			}

}

class customer extends Thread {
	producer pro;
	public customer(producer pro) 
	{
	this.pro = pro;
	}
	public void run(){
		for(int i = 1; i<10; i++){
			try
			{
				
				while(!pro.proover)
				{
					Thread.sleep(20);
					
				}
				}
				catch(Exception e){}
			}	
		System.out.println(pro.sb);
}}

public class ProductionChecks {
	public static void main(String args[]){
		
		producer obj = new producer();
		customer obj1 = new customer(obj);
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();
		t2.start();
		
		
	}

}
