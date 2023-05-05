import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
public class Copyfile
{  
   public static void main(String[]args)
   {
          
      try(FileInputStream fr = new FileInputStream("1234.jpg");//new and easier way to write
         FileOutputStream fw = new FileOutputStream("1234copy.jpg"))//copy
      {       
       int value = fr.read(); //makes values ints
       while(value != -1)       
       {
         // System.out.println(value);
         fw.write(value);
          value = fr.read();
       }
      }
      
      catch(FileNotFoundException e) 
            {
         System.out.println("file not found!");
      }  
      
      catch(IOException e)
      {
         System.out.println("IOEception occurred");
      }
           
   }
}