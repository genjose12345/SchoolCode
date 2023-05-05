import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JEventExample extends JFrame implements ActionListener
{  
   int count = 0;
   JLabel label = new JLabel("welcome to JFrame");
   JButton button = new JButton("Cliclk me");
   Font font = new Font("Comic Sans MS",Font.PLAIN,24);
   
   public static void main(String[]args)
   {
      JEventExample frame = new JEventExample();
      frame.setSize(300,300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public JEventExample()
   {
      setLayout(new FlowLayout());
      label.setFont(font);
      add(label);
      add(button);
      
      button.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if(count % 2 == 0)
      {
         label.setForeground(Color.RED);
      }
      else
      {
      label.setForeground(Color.BLACK);
      }
      count++;
   }
}