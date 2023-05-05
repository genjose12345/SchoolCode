import java.util.Scanner;
public class ChapterSevenPraticeTwo
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("enter a numertator");
      int num = in.nextInt();
      System.out.println("enter a denominator");
      int den = in.nextInt();
      if(den == 0)
      {
         System.out.println("you can't devided by 0 ");
      }
      else
      {
      double quotient = (double)num /den;
      System.out.printf("%d / %d converted to a decimal is %f.", num , den , quotient);
      }
   }
}