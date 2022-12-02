import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Test extends JFrame implements ActionListener{
	JLabel l;
	JButton b1,b2;
	ButtonGroup bg;
	JRadioButton jb[] = new JRadioButton[4];
	int c = 0, cur = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];
	Test(){
		super(s);
		l = new JLabel();
		add(l);
		bg = new ButtonGroup();
		for(int i = 0; i < 4; i++){
			jb[i] = new JRadioButton();
			add(jb[i]);
			bd.add(jb[i]);
		}
		b1 = new JButton("Next Question");
		b1.ActionListener(this);
		add(b1);
		set();
		l.setBounds(30, 40, 450, 30);
		jb[0].setBounds(50, 80, 100, 20);  
        jb[1].setBounds(50, 110, 100, 20);  
        jb[2].setBounds(50, 140, 100, 20);  
        jb[3].setBounds(50, 170, 100, 20);  
        b1.setBounds(100, 240, 100, 30);
        setDefaultCloseOpepration(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(250,100);
        setLayout(null);
        setSize(600,400);
        setLocation(250, 100)
	}
	public void ActionListener(ActionEvent e){
		if(e.getSource() == b1){
			if(check()){
				c += 1;
			}
			cur ++;
			set();
			if(cur == 9){
				b1.setEnabled(false);
				b1.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Result")){
			if(check()){
				c += 1;
			}
			cur++;
			JOptionPane.showMessageDialog(this, "Correct Answers = " + c);
			System.exit(0);
		}
	}
	void set(){
		jb[4].setSelected(true);
		if()
	}
}

public class Swing{
	public static void main(String... args){
		
	}
}