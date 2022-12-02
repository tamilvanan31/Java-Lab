import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Loginform extends Frame implements ActionListener{
	 Button b1 = new Button("Submit");
  	 Label l11 = new Label("Student details",Label.CENTER);
 	 Label l1 = new Label("Name:",Label.LEFT);
 	 Label l2 = new Label("Register number:",Label.LEFT);
 	 Label l3 = new Label("Department:",Label.LEFT);
 	 Label l4 = new Label("Semester:",Label.LEFT);
 	 Label l5 = new Label("Course: ",Label.LEFT);
 	 Label l6 = new Label("Staff: ",Label.LEFT);
 	 Label l7 = new Label(" ");
 	 Label l8 = new Label(" ");
 	 TextField t1=new TextField();
 	 TextField t2=new TextField();
 	 Choice dept = new Choice();
 	 Choice sem = new Choice();
 	 Choice sub = new Choice();
 	 Choice staff = new Choice();
	 public Loginform(){
	      add(l11);
		  add(l1);
		  add(t1);
		  add(l2);
		  add(t2);
		  add(l3);
		  add(l4);
		  add(l5);
		  add(l6);
		  add(dept);
		  add(sem);
		  add(sub);
		  add(staff);
		  add(b1);
		  add(l7);
		  dept.add("CT");
		  dept.add("IT");
		  dept.add("MECH");
		  dept.add("ECE");
		  dept.add("AUTO");
		  sem.add("1");
		  sem.add("2");
		  sem.add("3");
		  sem.add("4");
		  sem.add("5");
		  sem.add("6");
		  sem.add("7");
		  sem.add("8");
		  sub.add("Java");
		  sub.add("Signals");
		  sub.add("C");
		  sub.add("Cpp");
		  sub.add("Fundamentals of Auto Mobile Engineerring");
		  sub.add("Fluid Mechanics");
		  staff.add("ct1 Mam");
		  staff.add("ct2 Sir");
		  staff.add("auto1 Mam");
		  staff.add("auto2 Sir");
		  staff.add("ece1 Mam");
		  staff.add("ece2 Sir");
		  staff.add("mech2 Sir");
		  staff.add("mech2 Sir");
		  l1.setBounds(25,65,90,20);
		  l2.setBounds(25,90,96,25);
		  l3.setBounds(25,120,90,20);
		  l4.setBounds(25,185,90,20);
		  l5.setBounds(25,250,90,20);
		  l6.setBounds(25,300,90,20);
		  l11.setBounds(10,40,280,20);
		  t1.setBounds(120,65,170,20);
		  t2.setBounds(120,90,170,20);
		  dept.setBounds(120,120,106,20);
		  sem.setBounds(120,190,48,20);
		  sub.setBounds(120,250,160,20);
		  staff.setBounds(120,300,100,20);
		  b1.setBounds(120,328,50,30);
		  l7.setBounds(120,500,100,100);
		  b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){ 
		l7.setText("\tDetails " + "\nName: " + t1.getText() + "  Register Number: " +  t2.getText() + "  Department: " +  dept.getItem(dept.getSelectedIndex()) + "  Semester: " +  sem.getItem(sem.getSelectedIndex()) + "  Subject: " +   sub.getItem(sub.getSelectedIndex()) + "  Staff: " +  staff.getItem(staff.getSelectedIndex()));
	}
	public static void main(String... args){
		Loginform l=new Loginform();
		l.setSize(new Dimension(1280,720));
		l.setTitle("Student Registration Form");
		l.setVisible(true);
   }
}
class myWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent we){
    	System.exit(0);
	}
}