import java.awt.*;
import java.awt.event.*;
public class Awt_demo {
    public static void main(String... args) {
        Frame nf = new Frame("Button Example");
        nf.setSize(480, 480);
        nf.setLayout(new GridLayout(3, 1));
        nf.setResizable(false);
        Label statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
        Button nb = new Button("Click me");
        nb.setBounds(50, 100, 60, 30);
        nb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Welcome");
            }
        });
        nf.add(nb);
        nf.add(statusLabel);
        nf.setLayout(null);
        nf.setVisible(true);
    }
}