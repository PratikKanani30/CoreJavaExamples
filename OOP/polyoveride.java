package oop;



class commercial
{
	
	private String name;


	void setName(String name) 
	{
		this.name = name;
	}
	 String getName() 
	{
		return name;
	}

	
	void calculatebill(int units)
	{
		
		System.out.println("Customer " +getName());
		System.out.println("Bill amount = " +units*2.50);
		
	}
}
	class domestic extends commercial
	{
		
	
		
		void calculatebill(int units)
		{
			
			System.out.println("Customer " + getName());
			System.out.println("Bill amount = " +units*5);
			
		}
	}
	


public class polyoveride  {
	public static void main(String args[]){
		
		commercial c = new commercial();
		c.calculatebill(10);
		c.setName("Mahesh");
		domestic d = new domestic();
		c.setName("Shalini");
		d.calculatebill(10);
	}

}
