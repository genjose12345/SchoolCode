import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener
{
   int SMALL_PIZZA = 7;
   int MEDIUM_PIZZA = 9;
   int LARGE_PIZZA = 11;
   int EXTRA_LARGE_PIZZA = 14;
   double cheese = 0; 
   double extraCheese = 0; 
   double potato = .5; 
   double mushroom = .5; 
   double sausage = .5;    
   double pepperoni = .5;
   double cost = 0;
   
   JCheckBox smallPizza = new JCheckBox("Small Pizza",false);
   JCheckBox mediumPizza = new JCheckBox("Medium Pizza",false);    
   JCheckBox largePizza = new JCheckBox("Large Pizza",false);
   JCheckBox extraLargePizza = new JCheckBox("Extra Large Pizza",false);
   
   JCheckBox cheese2 = new JCheckBox("Cheese",false);
   JCheckBox pepperoni2 = new JCheckBox("Pepperoni",false);
   JCheckBox potato2 = new JCheckBox("Potato",false);
   JCheckBox mushroom2 = new JCheckBox("Mushroom",false);
   JCheckBox extraCheese2 = new JCheckBox("Extra Cheese",false);
   JCheckBox sausage2 = new JCheckBox("Sausage",false);
   
   JLabel aLabel = new JLabel("Order");
   JLabel bLabel = new JLabel("Choose your pizza size ");
   JLabel cLabel = new JLabel("Choose your toppings");
   JLabel dLabel = new JLabel("Total cost:");

   Font afont = new Font("Ariel",Font.BOLD,16);
   ButtonGroup group1 = new ButtonGroup();
  // ButtonGroup group2 = new ButtonGroup();
   
   public static void main(String[]args)
   {
      JPizza frame = new JPizza();
      frame.setSize(300,300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   
   public JPizza()
   {  
      super("Pizza order");
      setLayout(new FlowLayout());
      
      group1.add(smallPizza);
      group1.add(mediumPizza);
      group1.add(largePizza);
      group1.add(extraLargePizza);
      /*
      group2.add(cheese2);
      group2.add(pepperoni2);
      group2.add(potato2);
      group2.add(mushroom2);
      group2.add(extraCheese2);
      group2.add(sausage2);*/
      
      aLabel.setFont(afont);
      
      add(aLabel);
      add(bLabel);
      add(smallPizza);
      add(mediumPizza);
      add(largePizza);
      add(extraLargePizza);
      
      add(cLabel);
      add(cheese2);
      add(extraCheese2);
      add(potato2);
      add(mushroom2);
      add(sausage2);
      add(dLabel);
            
      smallPizza.addItemListener(this);
      mediumPizza.addItemListener(this);
      largePizza.addItemListener(this);
      extraLargePizza.addItemListener(this);
      cheese2.addItemListener(this);
      extraCheese2.addItemListener(this);
      potato2.addItemListener(this);
      mushroom2.addItemListener(this);
      sausage2.addItemListener(this);
   }
   
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int select = e.getStateChange();
      
      if(source == smallPizza)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += SMALL_PIZZA;
        }
        else 
        {
         cost -= SMALL_PIZZA;
        }
      }
      
      if(source == mediumPizza)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += MEDIUM_PIZZA;
        }
        else 
        {
         cost -= MEDIUM_PIZZA;
        }
      }
      
      if(source == largePizza)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += LARGE_PIZZA;
        }
        else 
        {
         cost -= LARGE_PIZZA;
        }
      }
      
      if(source == extraLargePizza)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += EXTRA_LARGE_PIZZA;
        }
        else 
        {
         cost -= EXTRA_LARGE_PIZZA;
        }
      }
      if(source == cheese2)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += cheese;
        }
        else 
        {
         cost -= cheese;
        }
      }
      if(source == potato2)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += potato;
        }
        else 
        {
         cost -= potato;
        }
      }
      if(source == pepperoni2)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += pepperoni;
        }
        else 
        {
         cost -= pepperoni;
        }
      }
      if(source == extraCheese2)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += extraCheese;
        }
        else 
        {
         cost -= extraCheese;
        }
      }
      if(source == mushroom2)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += mushroom;
        }
        else 
        {
         cost -= mushroom;
        }
      }
      if(source == sausage2)
      {
        if(select == ItemEvent.SELECTED)
        {
         cost += sausage;
        }
        else 
        {
         cost -= sausage;
        }
      }
      
      dLabel.setText("Cost of pizza: $" + cost);
      
      
   }
  
   
   
}