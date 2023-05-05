import   java.util.Scanner;
public class ArraysFive
{
   public static void main(String[] args)
   {
      String[] words = {"mom", "dad", "cat", "dog", "no"};
      Scanner In = new Scanner(System.in);
      System.out.println("enter a word");
      String userInput = In.nextLine();
      int index = -1;
      for(int i = 0; i < words.length; i++)
      {
         if(userInput.equals(words[i]))
         {
            index = i;
            break;
         }
      }
      System.out.println(index);
   }
}