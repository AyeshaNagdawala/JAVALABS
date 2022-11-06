import java.awt.*;

class MenuExample {
	
	MenuExample(){
	Frame f=new Frame("Menu and MenuItems Example");
	MenuBar mb= new MenuBar();
	f.setMenuBar(mb);
	
	Menu fi=new Menu("File");
	mb.add(fi);
	MenuItem N=new MenuItem("NEW");
	MenuItem O=new MenuItem("OPEN");
	MenuItem S=new MenuItem("SAVE");

	fi.add(N);
	fi.add(O);
	fi.add(S);
	
	Menu ed=new Menu("Edit");
	mb.add(ed);
	MenuItem cu=new MenuItem("CUT");
	MenuItem co=new MenuItem("COPY");
	MenuItem pa=new MenuItem("PASTE");

	ed.add(cu);
	ed.add(co);
	ed.add(pa);
	
	//frame 
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	
	}
	
	public static void main(String [] args){
		new MenuExample();
	}
}	