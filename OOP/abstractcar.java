package oop;

abstract class car{
	
	int regno;
	
	car(int r){
		regno=r;
	}
	
	void tankopen(){
		
		
		System.out.println("fill the tank");
	}
	
	
	abstract void steering(int direction, int angle);
	abstract void breaking(int force);
	
	
}
 
class Maruti extends car{

	Maruti(int r) {
		super(r);
		
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn");
		System.out.println("These is ordinary breaks");
		
	}
	void breaking(int force){
		System.out.println("Breaks applied");
		System.out.println("These is hydraulic breaks");
		
	}

	
	class Santro extends car{

		Santro(int r) {
			super(r);
			
		}
		void steering(int direction,int angle)
		{
			System.out.println("Take a turn");
			System.out.println("This car uses power steering");
			
		}
		void breaking(int force){
			System.out.println("Breaks applied");
			System.out.println("These is gas breaks");
			
		}
	
}
}

public class abstractcar {
	public static void main (String args[]){
		Maruti m = new Maruti(1001);
		m.tankopen();
		m.breaking(500);
		m.steering(1, 90);
	
}
	}


