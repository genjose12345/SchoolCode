import java.util.Scanner;
public class ChapterSevenPraticeProblemsOne
{
   public static void main(String[]args)
   {
      Scanner In = new Scanner(System.in);
      System.out.println("enter a number");
      int num = In.nextInt();
      if(num % 2 != 0)
      {
         System.out.println("this number is odd");
      }
      else 
      {
         System.out.println("this number is even");
      }
   }
}