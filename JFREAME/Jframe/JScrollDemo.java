import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JScrollDemo extends JFrame
{
   Container con = getContentPane();
   
   JPanel panel = new JPanel();
   JScrollPane scroll = new JScrollPane(panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
   JLabel label = new JLabel("Four Score and Seven Years Ago");
   
   Font font  = new Font("Arial",Font.PLAIN,20);
   
   public static void main(String args[])
   {
      JScrollDemo frame = new JScrollDemo();
      frame.setSize(200,100);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public JScrollDemo()
   {
      label.setFont(font);
    ///  con.add(panel);
      con.add(scroll);
      panel.add(label);
   }
}