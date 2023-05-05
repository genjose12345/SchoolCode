import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFontFrame extends JFrame implements ActionListener //, ItemListener
{
   JButton aButton = new JButton("Forte");
   JButton bButton = new JButton("Times Roman");
   JButton cButton = new JButton("Brodway");
   JButton dButton = new JButton("Comic Sans");
   
   Font afont = new Font("Forte",Font.PLAIN,24);
   Font bfont = new Font("Times New Roman",Font.PLAIN,24);
   Font cfont = new Font("Brodway",Font.PLAIN,24);
   Font dfont = new Font("Comic Sans MS",Font.PLAIN,24);
   
   JLabel aLabel = new JLabel("Font Demostration");
   
   public static void main(String[]args)
   {
      JFontFrame frame = new JFontFrame();
      frame.setSize(300,300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public JFontFrame()
   {  
      super(("Font Demostration"));
      setLayout(new FlowLayout());
      add(aButton);
      add(bButton);
      add(cButton);
      add(dButton);
      add(aLabel);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      
      if(source == aButton)
      {
         aLabel.setFont(afont);
      }
      else if(source == bButton)
      {
         aLabel.setFont(bfont);
      }
      else if(source == cButton)
      {
         aLabel.setFont(cfont);
      }
      else if(source == bButton)
      {
         aLabel.setFont(dfont);
      }
      
   }

}