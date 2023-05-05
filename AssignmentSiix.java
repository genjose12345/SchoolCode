import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class AssignmentSiix
{
   public static void main(String[] args) throws IOException
   {
      //Scanner
      Scanner in = new Scanner(System.in);
      
      System.out.println("Input the full name of your txt file");
      String input2 = in.nextLine();
      
      System.out.println("What word you you like to search for in " + input2 + "\nThe number of times it appears will be returned");
      String input = in.nextLine();

      //file reader and word searcher
      File f1=new File(input2); //Creation of File Descriptor for input file
      String[] words=null; //Intialize the word Array
      int counter=0; 
      FileReader fr = new FileReader(f1); //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
      String s;
      while((s=br.readLine())!=null)    //Reading Content from the file
      {
         words=s.split(" ");   //Split the word using space
         for (String word : words) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                  counter++;    //If Present increase the count by one
                 }
          }         //wc=wc+words.length;   //increase the word count for each word
      }
      fr.close();
            
      //File Writer & notification     
      if(counter != 0)
      {
         System.out.println(counter);
         try(FileWriter fw = new FileWriter("answer.txt"))
         {
            fw.write(String.format("Number of times '%s' appeared: %s", input, counter));
         }
         catch(FileNotFoundException e)
         {
            e.printStackTrace();
         }
         catch(IOException e)
         {
            e.printStackTrace();
         }
         JOptionPane.showMessageDialog(null,"The answer has been recorded in the new file 'answer' for your convience");
      }
      else
      {
         System.out.println("No words found. Try again.");
      }

   }
}