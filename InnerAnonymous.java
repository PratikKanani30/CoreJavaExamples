import java.awt.*;
import java.awt.event.*;


class but extends Frame
{
	but() 	
	{
		Button b = new Button("OK");
		add(b);
//Hiddin inner class
			b.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent ae) {
				System.exit(0);
		
				}
				});
	}	



}


public class InnerAnonymous {
	public static void main(String args[]){
		but obj = new but();
		obj.setSize(400, 300);
		obj.setVisible(true);
	}

}
