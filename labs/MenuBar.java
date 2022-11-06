import javax.swing.*;
import java.awt.event.*;

class MenuBar extends JFrame implements ActionListener{
	JFrame f;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectAll,open,save,newF,close,feedback,exit;
	JTextArea ta;
	
	MenuBar(){
	//super("***NOTEPAD using GUI");
	f=new JFrame("***NOTEPAD LITE***");
	mb=new JMenuBar();
	f.add(mb);
	
	file=new JMenu("FILE");
	edit=new JMenu("EDIT");
	help=new JMenu("HELP");	
	mb.add(file);
	mb.add(edit);
	mb.add(help);
	
	cut=new JMenuItem("CUT");
	copy=new JMenuItem("COPY");
	paste=new JMenuItem("PASTE");
	selectAll=new JMenuItem("SELECT ALL");
	edit.add(cut);
	edit.add(copy);
	edit.add(paste);
	edit.add(selectAll);
	
	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);
	selectAll.addActionListener(this);
	
	open=new JMenuItem("OPEN FILE");
	save=new JMenuItem("SAVE FILE");
	newF=new JMenuItem("NEW FILE");
	close=new JMenuItem("CLOSE FILE");
	file.add(open);
	file.add(save);
	file.add(newF);
	file.add(close);
	
	feedback=new JMenuItem("FEEDBACK");
	exit=new JMenuItem("EXIT");
	help.add(feedback);
	help.add(exit);
	
	ta=new JTextArea();
	ta.setBounds(10,10,580,380);
	f.add(ta);
	
	f.setJMenuBar(mb);
	f.setLayout(null);
	f.setLocation(300,100);
	f.setSize(600,450);
	f.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e){
	if(e.getSource()==cut)
		ta.cut();
	
	if(e.getSource()==copy)
		ta.copy();

	if(e.getSource()==paste)
		ta.paste();
	
	if(e.getSource()==selectAll)
		ta.selectAll();
	
	}
	
	public static void main(String [] args){
		new MenuBar();
	}	
}	