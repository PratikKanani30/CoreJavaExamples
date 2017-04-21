package Theard;


public class current {
	public static void main(String args[]){
		
		System.out.println("Let us find the current theard");
		
		Thread t = Thread.currentThread();
		System.out.println("Current theard\n" +t+"\n Its name : " +t.getName());
		
		
	}

}
