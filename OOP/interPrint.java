package oop;
import java.io.*;

	interface printer
	{
		void print(String text);
		void disconnect();
	}

	class IBMPrinter implements printer{

		@Override
		public void print(String text) {
			
			System.out.println(text);
		}

		@Override
		public void disconnect() {
			System.out.println("Printing completed");
			System.out.println("Disconnected from IBM printer");
			
			}
		
		}
class Epsonprinter implements printer{

	@Override
	public void print(String text) {
		System.out.println(text);
		
		
	}

	@Override
	public void disconnect() {
		System.out.println("Printing completed");
		System.out.println("Disconnected from Epson printer");
		
	}
	
}


public class interPrint {
	public static void main (String args[]) throws Throwable , Exception , FileNotFoundException
	{
		FileReader fr = new FileReader("config.txt");
		LineNumberReader inr = new LineNumberReader(fr);
		String printername = inr.readLine();
		
		System.out.println("Loading thr driver for: "+printername);
		
		Class c = Class.forName(printername);
		printer ref = (printer)c.newInstance();
		
		ref.print(" Hello,This is printed on the printer");
		ref.disconnect();
	}

}
