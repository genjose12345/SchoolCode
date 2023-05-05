import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JColorFrame extends JFrame implements ActionListener 
{
   Container con = getContentPane();
   
   JPanel panel = new JPanel();
   JPanel panel2 = new JPanel();
   JPanel panel3 = new JPanel();
   JPanel panel4 = new JPanel();
   JPanel panel5 = new JPanel();
   
   JButton color = new JButton("Change Color");
   
   public static void main(String args[])
   {
      JColorFrame frame = new JColorFrame();
      frame.setSize(200,100);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public JColorFrame()
   {
      super("Color Change");
      con.setLayout(new BorderLayout());
      panel.setBackground(Color.red);
      panel2.setBackground(Color.green);
      panel3.setBackground(Color.blue);
      panel4.setBackground(Color.black);

      
      add(panel,"North");
      add(panel2,"East");
      add(panel3,"South");
      add(panel4,"West");
      add(color,"Center");
      
      color.addActionListener(this);    
   }
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      int r = (int)(Math.random() * 256);
      int g = (int)(Math.random() * 256);
      int b = (int)(Math.random() * 256);
      
      int panelNumber = (int)(Math.random() * 6) + 1;
      
      switch(panelNumber)
      {
         case 1:
            panel.setBackground(new Color(r,g,b));
            break;
         case 2:
            panel2.setBackground(new Color(r,g,b));
            break;
         case 3:
            panel3.setBackground(new Color(r,g,b));
            break;
         case 4:
            panel4.setBackground(new Color(r,g,b));
            break;
            
         default:
         break;
         
      }
   }
}