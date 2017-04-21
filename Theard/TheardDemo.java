package Theard;


import java.io.IOException;

class MyTheard extends Thread

	{ 	Boolean stop = false;
		public void run()
		{
	
				for(int i = 1; i<100000; i++)
				{
					System.out.println(i);
					if(stop)
					return;
				}
	
		}
	}

	public class TheardDemo {
	public static void main (String args[]) throws IOException{
		
		MyTheard obj = new MyTheard();
		Thread t = new Thread(obj);
		t.start();
		System.in.read();
		obj.stop = true;
		
		
		
	}

}
