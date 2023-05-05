import java.util.Scanner;

public class ArraysSix
{
   public static void main(String[] args)
   {
      Scanner In = new Scanner(System.in);
      double[] numbers = { 2.3, 4.5, 5.5, 6.7, 3.1};
      System.out.println("enter a number");
      double Input = In.nextDouble();
      
      
      int count  = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         if( numbers[i]> Input)
         {
            count++;
         }
      }
      System.out.println(count);
   }
}