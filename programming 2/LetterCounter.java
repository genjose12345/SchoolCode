import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class LetterCounter
{
   public static void main(String[]args)throws IOException
   {
      
      String line;
      int numberOfLetters = 0;
      try
      {
         Scanner in = new Scanner(System.in);         
         System.out.println("Enter file name");
         String fileName = in.nextLine();     
         System.out.println("enter a Chacter");
         char letter = in.next().charAt(0);      
         File f = new File(fileName);
         BufferedReader br = new BufferedReader(new FileReader(f));
         line = br.readLine();
         
         while(line != null)
         {
            for(int i= 0 ; i < line.length(); i++)
            {
              if(line.charAt(i) == letter)
              {
                  numberOfLetters += 1;
              }
            }
            line = br.readLine();                 
         }
         System.out.println("The number of times " + letter + " Appears is:"+numberOfLetters);
         in.close();
      }
      catch(FileNotFoundException e)
      {
         System.out.println("file not found");
      }
      
      catch(NoSuchElementException e)
      {
         System.out.println("nothing here");
      }
      
   }
}