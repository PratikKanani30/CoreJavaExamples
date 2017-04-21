package oop;



class shape
{
	
	protected double l;
	 shape(double l) 
	 {
		this.l =l;
	 }
}

class square extends shape
{
	

	
	square(double l) 
	{
		super(l);
		
	}
	void area()
	{
		
		System.out.println("Area of square" + (l*l));
	}

}


class rectangle extends shape
{
	double b;
	rectangle(double l,double b) {
		super(l);
		this.b = b;
		
	}
	
	void area()
	{
		
		System.out.println("Area of rectangle" +(l*b));
	}

}


public class inheritanceRectSqArea {
	public static void main(String args[]){
		
		square sq = new square(4);
		rectangle re = new rectangle(4,5);
		sq.area();
		re.area();
		
	}

}
