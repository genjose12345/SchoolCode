import javax.swing.*;
import java.util.Scanner;
public class GradeException extends Exception

{
   public static String[] validGrade = {"A","B","C","D","F","I"};
   public GradeException(String msg)
   {
      super(msg);
   }
}

class TestGrade 
{
   public static void main(String[]args)
   {
        
         //String letter = "";
         int[] student = {1111,1112,1113,1114,1115,1116,1117,1118,1119,1110};
         String[] grade =  new String[student.length];
         boolean validGrade = false;
         Scanner in = new Scanner(System.in);
         
     for(int i  = 0; i< student.length; i++)
     {
       System.out.println("Enter a letter Grade");  
       String letter = in.nextLine();             
    // System.out.printf("Student id: %d  Grade: %s", student[i],letter);
       validGrade = false;
         

         
      try
      {
         for(int j = 0; j <student.length;j++)
         {
            System.out.printf("Student id: %d  Grade: %s", student[i],letter);

         }
         if(letter.equals("A") || letter.equals("B") ||letter.equals("C") ||letter.equals("D") ||letter.equals("F"))
         {
                     }
         if(!validGrade)
         {
            throw new GradeException("Invalid Grade");
         }
      }
      catch(GradeException e)
      {
         System.out.println("not a valid grade");
      }
      catch(Exception e)
      {
         System.out.println("somethign went wrong");
      }
    }
   }
}

