import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameLab8 extends JFrame implements MouseListener
{
   Container con = getContentPane();
   JLabel welcome = new JLabel("Welcome",JLabel.CENTER);
   JLabel dalton = new JLabel("To Dalton State College",JLabel.CENTER);
   JMenuBar menuBar = new JMenuBar();
   
   JMenu schoolMenu = new JMenu("Information");
   JMenu majorMenu = new JMenu("MajorFields");
   JMenu activeMenu = new JMenu("Activities");
   
   JMenuItem liberalArts= new JMenuItem("Liberal Arts");
   JMenuItem business= new JMenuItem("Business");
   JMenuItem mathScience= new JMenuItem("Math&Science");
   JMenuItem computerScience= new JMenuItem("Computer Science");
   JMenuItem communications = new JMenuItem("Communications");
   JMenuItem clubs = new JMenuItem("Clubs");
   JMenuItem sports = new JMenuItem("Sports");
   
   public static void main(String[]args)
   {
      JFrameLab8 frame = new JFrameLab8();
      frame.setSize(300,300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public JFrameLab8()
   {
      super("JFrameLabe8");
      con.setLayout(new GridLayout(2,0));
      welcome.setFont(new Font("Comic Sans MS",Font.BOLD,24));
      dalton.setFont(new Font("Comic Sans MS",Font.BOLD,24));
      
      con.add(welcome);
      con.add(dalton);
      welcome.setVisible(false);
      dalton.setVisible(false);
      
      setJMenuBar(menuBar);
      
      menuBar.add(schoolMenu);
         schoolMenu.add(liberalArts);
         schoolMenu.add(business);
         schoolMenu.add(mathScience);
         
         menuBar.add(majorMenu);
         majorMenu.add(computerScience);
         majorMenu.add(communications);
         
         menuBar.add(activeMenu);
         activeMenu.add(clubs);
         activeMenu.add(sports);
         
         addMouseListener(this);
   }   
   public void mouseExited(MouseEvent e)
   {
      con.setBackground(Color.WHITE);
      
   }
   public void mouseEntered(MouseEvent e)
   {
      welcome.setForeground(Color.BLUE);
      welcome.setVisible(true);     
      dalton.setForeground(Color.gray);
      dalton.setVisible(true);
   }
   public void mousePressed(MouseEvent e)
   {
   }
   public void mouseReleased(MouseEvent e)
   {
   }
   public void mouseClicked(MouseEvent e)
   {
   }
   
}