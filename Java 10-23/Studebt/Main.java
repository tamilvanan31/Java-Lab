import java.awt.*;
import java.awt.event.*;
class frame extends Frame implements ActionListener
{
Frame f;
            frame(String title,Frame f)
            {
                        super(title);
                        MenuBar mb=new MenuBar();
                        setMenuBar(mb);
                        Menu mr=new Menu("Registration");
                        MenuItem mi=new MenuItem("Register");
                        MenuItem m1=new MenuItem("-");
                        MenuItem m=new MenuItem("Exit");
                        mb.add(mr);
                        mr.add(mi);
                        mr.add(m1);
                        mr.add(m);
                        mi.addActionListener(this);
                        m.addActionListener(this);
                        this.f=f;
            }
            public void actionPerformed(ActionEvent ae)
            {
                        String str=ae.getActionCommand();
                        if(str.equals("Register"))
                                    f.setVisible(true);
           
                        if(str.equals("Exit"))
                                    System.exit(0);
            }
}

class frame1 extends Frame
{
frame1()
            {
                        super("Form_frames");
                        setLayout(null);

                        Label b=new Label("Name");
                        b.setBounds(22,35,60,36);
                        add(b);

                        TextField tf=new TextField(30);
                        tf.setBounds(120,40,200,30);
                        add(tf);

                        Label l1=new Label("Register No");
                        l1.setBounds(22,70,70,40);
                        add(l1);

                        TextField tf1=new TextField(30);
                        tf1.setBounds(120,75,200,30);
                        add(tf1);

                        Label l2=new Label("Address");
                        l2.setBounds(22,110,70,36);
                        add(l2);

                        TextField tf2=new TextField(30);
                        tf2.setBounds(120,115,200,30);
                        add(tf2);

                        Label l3=new Label("Phone No");
                        l3.setBounds(22,150,70,30);
                        add(l3);

                        TextField tf3=new TextField(30);
                        tf3.setBounds(120,150,200,30);
                        add(tf3);

                        Button bt=new Button("Save");
                        bt.setBounds(60,200,70,30);
                        add(bt);

                        Button bt1=new Button("View");
                        bt1.setBounds(150,200,70,30);
                        add(bt1);

            }
}
public class Main
{
            public static void main(String args[])
            {
                        frame1 f=new frame1();
                        frame f1=new frame("Registration",f);
                        f1.setVisible(true);
                        f1.setSize(500,500);
                        f.setVisible(false);
                        f.setSize(400,400);
            }
}