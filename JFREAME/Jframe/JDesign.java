import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDesign extends JFrame implements ActionListener 
{
   Container con = getContentPane();
   
   JPanel south = new JPanel();
   JPanel east = new JPanel();
   
   JLabel label = new JLabel("Enter Text",JLabel.CENTER);
   JLabel charCount = new JLabel("words: 3");
   JLabel wordCount = new JLabel("characters: 15"); 
   
   JTextArea text= new JTextArea("Welcome to java");
   JScrollPane scroll = new JScrollPane(text);
   
   JButton bColor = new JButton("Change Background Color");
   JButton fColor = new JButton("Change Background Color");
   JButton count = new JButton("count words");
   
   Font arial  = new Font("Arial",Font.PLAIN,16);
   Font arialBold  = new Font("Arial",Font.BOLD,20);
      
   
   public static void main(String args[])
   {
      JDesign frame = new JDesign();
      frame.setSize(400,250);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public JDesign()
   {
      con.setLayout(new BorderLayout());
      text.setFont(arialBold);
      text.setLineWrap(true);
      text.setWrapStyleWord(true);
      scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
      label.setFont(arial);
      wordCount.setFont(arial);
      charCount.setFont(arial);
      
      east.setLayout(new GridLayout(0,1));
      east.add(bColor);
      east.add(fColor);
      east.add(count);
      
      south.setLayout(new GridLayout(0,2));
      south.add(wordCount);
      south.add(charCount);
      
      
      con.add("North",label);
      con.add("Center",scroll);
      con.add("South",south);
      con.add("East",east);
      
      bColor.addActionListener(this);
      fColor.addActionListener(this);
      count.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      
      int r = (int)(Math.random() *256);
      int g = (int)(Math.random() *256);
      int b = (int)(Math.random() *256);
      
      if(source == bColor)
      {
         text.setBackground(new Color(r,g,b));
      }
      else if(source == fColor)
      {
         text.setForeground(new Color(r,g,b));
      }
      else if(source == count)
      {
         String str = text.getText();
         String[] words = str.split("//s");
         wordCount.setText("words:" + words.length);
         charCount.setText("Characters:  " + str.length());
      }
   }
}