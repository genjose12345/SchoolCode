import java.util.Scanner;
public class ChapterSevenPraticeProblemsTwo
{
   public static void main(String[]args)
   {
      Scanner In = new Scanner(System.in);
      System.out.println("enter todays high temp");
      int high = In.nextInt();
      System.out.println("enter todays low");
      int low = In.nextInt();
      int Swing = high - low;
      
      if(high >= 90)
      {
         System.out.println("Heat WArning");
      }
      1if(low < 32)
      {
         System.out.println("Freeze warning");
      }
      if(Swing >= 40)
      {
         System.out.println("large temperatur swing");
      }
   }
   
}