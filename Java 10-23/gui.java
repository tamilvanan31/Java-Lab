import javax.swing.*;
class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1280,720);
       JButton button = new JButton("Azhuthavum");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}