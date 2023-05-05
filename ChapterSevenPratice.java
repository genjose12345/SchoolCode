import java.util.Scanner;
   public class ChapterSevenPratice
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("enter a number");
      int first = in.nextInt();
      System.out.println("enter a number");
      int second = in.nextInt();
      System.out.println("enter a number");
      int third = in.nextInt();
      
      
      int count = 0;
      
      if(first % 2 !=0)
      {
         count = count + 1;
      }
      if(second % 2 !=0)
      {
         count = count + 1;
      }
      if(third % 2 !=0)
      {
         count = count + 1;
      }



      System.out.printf("the number of odd integers enderted: %d", count);

      
   }
}