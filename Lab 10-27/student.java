import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class student extends Frame implements ActionListener {String msg;
  Button b1 = new Button("Submit");
  Label l11 = new Label("Student details",Label.CENTER);
  Label l1 = new Label("Name:",Label.LEFT);
  Label l2 = new Label("Register number:",Label.LEFT);
  Label l3 = new Label("Department:",Label.LEFT);
  Label l4 = new Label("Semester:",Label.LEFT);
  Label l5 = new Label("Course: ",Label.LEFT);
  Label l6 = new Label("Staff: ",Label.LEFT);
  Label l7 = new Label(" ");
  TextField t1=new TextField();
  TextField t2=new TextField();
  Choice dept = new Choice();
  Choice sem = new Choice();
  Choice sub = new Choice();
  Choice staff = new Choice();
public student()
 {addWindowListener(new myWindowAdapter());
  //setBackground(Color.cyan);
  //setForeground(Color.black);
  setLayout(null);
  add(l11);
  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(l3);
  add(l4);
  add(l5);
  add(l6);
  add(l7);
  add(dept);
  add(sem);
  add(sub);
  add(staff);
  add(b1);
  add(b1);
  b1.addActionListener(this);
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
  sub.add("sub1");
  sub.add("sub2");
  sub.add("sub3");
  staff.add("s1");
  staff.add("s3");
  staff.add("s2");
  l1.setBounds(25,65,90,20);
  l2.setBounds(25,90,90,25);
  l3.setBounds(25,120,90,20);
  l4.setBounds(25,185,90,20);
  l5.setBounds(25,250,90,20);
  l6.setBounds(25,300,90,20);
  l11.setBounds(10,40,280,20);
  t1.setBounds(120,65,170,20);
  t2.setBounds(120,90,170,20);
  dept.setBounds(120,120,106,20);
  sem.setBounds(120,190,48,20);
  sub.setBounds(120,250,55,20);
  staff.setBounds(120,300,56,20);
  b1.setBounds(120,360,50,50);
}
public void paint(Graphics g)
{g.drawString(msg,200,450);}
public void actionPerformed(ActionEvent ae){
    l7.setText("Details "+t1.getText() + t2.getText() + dept.getItem(dept.getSelectedIndex()) + sem.getItem(sem.getSelectedIndex()) + sub.getItem(sub.getSelectedIndex()) + staff.getItem(staff.getSelectedIndex()));
}
public static void main(String g[]) {
  student stu=new student();
  stu.setSize(new Dimension(500,500));
  stu.setTitle("student registration");
  stu.setVisible(true);
 }
}
 class myWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent we){
    System.exit(0);
 }
}