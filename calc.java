class numbers
{
	

private double x,y;

		numbers(double a,double b)
		{
			x=a;
			y=b;
		}

		void sum()
		{
			double c = x+y;
			System.out.println("Sum is "+c);	
	
		}

		void sub()
		{
			double c =x-y;
			System.out.println("Sub is "+c);
		}
void mul()
{
	double c =x*y;
	System.out.println("Mul is "+c);

}

void div()
{
	double c =x/y;
	System.out.println("Mul is "+c);

}


}
public class calc {
	public static void main(String args[])
	{
		numbers n1 = new numbers(5,3);
		
		n1.sum();
		n1.sub();
		n1.mul();
		n1.div();
	}

}
