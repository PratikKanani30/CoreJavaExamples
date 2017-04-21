package Theard;
class reserve implements Runnable
{ 
	 int available = 1;
	 int wanted;
   
	 public reserve(int i) {
	 wanted = i;
	
}

	@Override
	public void run() {
		synchronized(this)
		{
			System.out.println("Available berth = "+available);
			if (available >= wanted){
				
				String name = Thread.currentThread().getName();
				
				System.out.println(wanted+" Berth reserved for " +name);
				try{
					
					Thread.sleep(1500);
					available = available - wanted;
				}
					catch(InterruptedException ie ) 
					{
						
					}
					
				}
			}
			
		}
		
	}
	
public class Synchronizton {
	
	public static void main(String args[]){
		
		
		reserve obj = new reserve(1);
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("First person");
		t2.setName("Second person");
		t1.start();
		t2.start();
		
	}
	

}
