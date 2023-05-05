import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HealthInsurance extends JFrame implements ItemListener
{

   int HMO_PRICE = 200;
   int PPO_PRICE = 600;
   int DENTAL_PRICE = 75;
   int VISION_PRICE = 20;
   int cost = HMO_PRICE;
   
   JCheckBox hmo = new JCheckBox("HMO",true);
   JCheckBox ppo = new JCheckBox("PPO",true);    
   JCheckBox dental = new JCheckBox("Dental",true);
   JCheckBox vision = new JCheckBox("Vision",true);
   
   JLabel aLabel = new JLabel("Chosee your health insurance option");
   JLabel bLabel = new JLabel("Primary care (Choose one) :");
   JLabel cLabel = new JLabel("Optional insurance:");
   JLabel dLabel = new JLabel("Insurance cost:");

   Font afont = new Font("Ariel",Font.BOLD,16);
   ButtonGroup insGrp = new ButtonGroup();
      
   public static void main(String[]args)
   {
      HealthInsurance frame = new HealthInsurance();
      frame.setSize(300,300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public HealthInsurance()
   {  
      super("Isurance");
      setLayout(new FlowLayout());
      insGrp.add(hmo);
      insGrp.add(ppo);
      aLabel.setFont(afont);
      
      add(aLabel);
      add(bLabel);
      add(hmo);
      add(ppo);
      add(cLabel);
      add(dental);
      add(vision);
      add(dLabel);
            
      hmo.addItemListener(this);
      ppo.addItemListener(this);
      dental.addItemListener(this);
      vision.addItemListener(this);
   }
   
   public void itemStateChanged(ItemEvent e)
   {
 
      Object source = e.getSource();
      int select = e.getStateChange();
   
   
   if(source == hmo)
   {
     if(select == ItemEvent.SELECTED)
     {
      cost += HMO_PRICE;
     }
     else 
     {
      cost -= HMO_PRICE;
     }
   }
   
   if(source == ppo)
   {
     if(select == ItemEvent.SELECTED)
     {
      cost += PPO_PRICE;
     }
     else 
     {
      cost -= PPO_PRICE;
     }
   }
   if(source == dental)
   {
     if(select == ItemEvent.SELECTED)
     {
      cost += DENTAL_PRICE;
     }
     else 
     {
      cost -= DENTAL_PRICE;
     }
   }
   if(source == vision)
   {
     if(select == ItemEvent.SELECTED)
     {
      cost += VISION_PRICE;
     }
     else 
     {
      cost -= VISION_PRICE;
     }
   }
      dLabel.setText("Cost of Insurance: $" + cost);
}
}