import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class checkedPassword
{
   public static void main(String[]args)throws IOException
   {
      Path p = Paths.get("passwordList.txt");
      InputStream in = null;
      OutputStream out = null;
      String userID,password,line;
      String[] array = new String[2];
      boolean userFound = false;
      boolean goodPassword = false;
      
      
      userID = JOptionPane.showInputDialog(null,"Enter your username");
      password = JOptionPane.showInputDialog(null,"Enter your password");
      
      try
      {
         in = Files.newInputStream(p);
         BufferedReader br = new BufferedReader(new InputStreamReader(in));
         line = br.readLine();
         while(line !=null)
         {
            array = line.split(",");
            if(userID.equals(array[0]));
            {
               userFound = true;
               if(password.equals(array[1]))
               {
                  goodPassword = true;
               }
            }
            break;
         }    
         line = br.readLine();
      }
      catch(IOException e)
      {
         System.out.println("IO message");
      }
      
      catch(Exception e)
      {
         System.out.println("Excetion Message:");
      }
     
     
      if(!userFound)
      {
         int result = JOptionPane.showConfirmDialog(null,"Are you a new customer");
         if(result == JOptionPane.YES_OPTION)
         {
            out = Files.newOutputStream(p,APPEND);
            out = new BufferedOutputStream(out);
            line = "\n" + userID + "," + password;
            byte[] data = line.getBytes();
            out.write(data);
            out.close();
         }
         else
         {
            JOptionPane.showMessageDialog(null,"thanks for dropping by");
         }
      }
      else if(!goodPassword)
      {
         JOptionPane.showMessageDialog(null,"Invalid Password for " + userID);
      }
      else
      {
         JOptionPane.showMessageDialog(null,"Welcome \n Time to place your Order"); 
      }
   }
}