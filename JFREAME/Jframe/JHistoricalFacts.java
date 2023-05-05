import javax.swing.*;
import java.awt.*;
public class JHistoricalFacts
{
   public static void main(String[]args)
   {
      JFrame window = new JFrame("Historical Facts");
      JTextField t1 = new JTextField("enter your historical fact");
      
      
      JLabel label1 = new JLabel("Turkeys Were Once Worshipped Like Gods.");
      JLabel label2 = new JLabel("Paul Revere Never Actually Shouted, The British Are Coming!");
      JLabel label3 = new JLabel("The Olympics Used to Award Medals for Art.");
      JLabel label4 = new JLabel("One Time, 100 Imposters Claimed to Be Marie Antoinette's Dead Son");
      JLabel label5 = new JLabel("Napoleon Was Once Attacked By a Horde of Bunnies");
      
      Font typeSet1 = new Font(Font.SERIF,Font.BOLD,28);
      Font typeSet2 = new Font(Font.SANS_SERIF,Font.BOLD,28);
      Font typeSet3 = new Font(Font.DIALOG,Font.BOLD,28);
      Font typeSet4 = new Font(Font.DIALOG_INPUT,Font.BOLD,28);
      Font typeSet5 = new Font(Font.MONOSPACED,Font.BOLD,28);
      
      label1.setFont(typeSet1);
      label2.setFont(typeSet2);
      label3.setFont(typeSet3);
      label4.setFont(typeSet4);
      label5.setFont(typeSet5);
            
      label1.setLocation(100,100);
      label2.setLocation(300,300);
      label3.setLocation(500,500);
      label4.setLocation(700,700);
      label5.setLocation(900,900);
      t1.setLocation(1100,1100);
      
      label1.setVisible(true);
      label2.setVisible(true);
      label3.setVisible(true);
      label4.setVisible(true);
      label5.setVisible(true);
      t1.setVisible(true);
            
      window.setSize(1200,400);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);  
      
      window.setLayout(new FlowLayout());
      window.add(label1);
      window.add(label2);
      window.add(label3);
      window.add(label4);
      window.add(label5);  
      window.add(t1);             
      
   }
}