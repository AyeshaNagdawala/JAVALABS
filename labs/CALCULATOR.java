import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A_calculator implements ActionListener {
    JFrame frame = new JFrame();
    Label l1 = new Label("First num");
    Label l2 = new Label("second num");
    Label l3 = new Label("result");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    Button b1 = new Button("Add");
    Button b2 = new Button("Sub");
    Button b3 = new Button("Multiply");
    Button b4 = new Button("Divide");
    Button b5 = new Button("Cancel");

    A_calculator() {
        l1.setFont(new Font("MV Boli", Font.BOLD, 15));
        l2.setFont(new Font("MV Boli", Font.BOLD, 15));
        l3.setFont(new Font("MV Boli", Font.BOLD, 15));

        l1.setBounds(50, 100, 100, 20);
        l2.setBounds(50, 140, 100, 20);
        l3.setBounds(50, 180, 100, 20);

        t1.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 140, 100, 20);
        t3.setBounds(200, 180, 100, 20);

        b1.setBounds(50, 250, 50, 20);
        b2.setBounds(110, 250, 50, 20);
        b3.setBounds(170, 250, 50, 20);
        b4.setBounds(230, 250, 50, 20);
        b5.setBounds(290, 250, 50, 20);

        frame.add(l1);      frame.add(l2);      frame.add(l3);
        frame.add(t1);      frame.add(t2);      frame.add(t3);
        frame.add(b1);      frame.add(b2);      frame.add(b3);      frame.add(b4);      frame.add(b5);

        b1.addActionListener(this);     b2.addActionListener(this);     b3.addActionListener(this);
        b4.addActionListener(this);     b5.addActionListener(this);

        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);
    }

    public void actionPerformed(ActionEvent e){
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());

        if(e.getSource()==b1){
            t3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==b2){
            t3.setText(String.valueOf(n1-n2));
        }
        if(e.getSource()==b3){
            t3.setText(String.valueOf(n1*n2));
        }
        if(e.getSource()==b4){
            t3.setText(String.valueOf((float)n1/n2));
        }
        if(e.getSource()==b5){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new A_calculator();
    }
}
