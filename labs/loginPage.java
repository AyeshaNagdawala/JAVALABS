import java.awt.*;
import java.awt.event.*;

class loginPage implements ActionListener{
	//Declaring frame and objects.
	Frame f=new Frame("LOGIN PAGE");
	Label l1=new Label("Email Id");
	Label l2=new Label("Password");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	
	Button b1=new Button("Sign In");
	
	//set boundar,size using constructor
	loginPage(){
		//(x se dist,y se dist, x length,y length)
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		
		t1.setBounds(170,100,100,20);
		t2.setBounds(170,140,100,20);
		
		b1.setBounds(50,180,50,20);
		
		//Adding components to frame
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		
		b1.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(450,370);
	}
	
	public static void main(String [] args){
		new loginPage();
	
	}	
}	