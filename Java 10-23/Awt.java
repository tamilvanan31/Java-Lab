import java.awt.*;
import java.awt.event.*;
public class Awt extends WindowAdapter implements ActionListener{
	Frame wel;
	TextField op;
	Button bt;
	Awt(){
		wel = new Frame();
		wel.addWindowListener(this);
		wel.setResizable(false);
		wel.setBounds(50, 50, 300, 300);
		wel.setLayout(null);
		wel.setVisible(true);
		op = new TextField();
		op.setBounds(50, 200,200, 30);
		wel.add(op);
		bt = new Button("Click");
		bt.setBounds(50, 150, 80, 30);
		bt.addActionListener(this);
		wel.add(bt);
	}
	public void windowClosing(WindowEvent e){
		wel.dispose();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == bt){
			op.setText("Hey");
		}
	}
	public static void main(String... args){
		new Awt();
	}
}
