import java.util.Scanner;
import java.io.*;
public class AssignmentSix
{
   public static void main(String[] args) throws IOException
   {
      int count = 0;
      String a;
      String[] words = null;
      
      Scanner scanner = new Scanner(System.in);     
      System.out.println("enter a string value");      
      String v = scanner.nextLine();            
      System.out.println("enter a file name");
      String v2 = scanner.nextLine();      
       
      FileReader fr = new FileReader(v2);
      BufferedReader br = new BufferedReader(fr);  
   
         while((a=br.readLine())!=null)
         {
            words=a.split(" ");
            for(String word : words)
            {
               if(word.equals(v))
               {
                  count++;
               }
            }
         }
         fr.close();
       
       try(FileWriter fw = new FileWriter("answer.txt"))
         {
            fw.write(String.format("the number of Strings  in the text file with %s is %d",v,count));           
         }

      catch(FileNotFoundException e)
      {
         System.out.println("file not found");
      }
      catch(IOException e)
      {
         System.out.println("Exception not found");
      }
     System.out.println(count);
   
   }
}