import java.util.Scanner;
public class ChapterSevenPraticeProblemsThree
{
   public static void main(String[]args)
   {
      Scanner In = new Scanner(System.in);
      System.out.println("enter distance");
      int distance = In.nextInt();
      if(distance <= 100)
      {
         System.out.println("the cost is $5");
      }
       if(distance > 100 && distance <= 500)
      {
         System.out.println("the cost is $8");
      }
       if(distance >500 && distance <1000)
      {
         System.out.println("the cost is $10");
      }
       if(distance > 1000)
      {
         System.out.println("the cost is $12");
      }


   }
}