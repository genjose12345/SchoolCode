public class AssignmentEight
{
   public static void main(String[]args)
   {
     System.out.println(reverseWord("hello"));
     System.out.println(reverseWord("super"));
     System.out.println(reverseWord("mario"));
     

   }
   public static String reverseWord(String word)
   {
      MyStack<Character> stack = new MyStack<Character>();
      char[] reverseLetter = new char[word.length()];
      
      for(int i = 0; i < word.length();i++)
      {  
         stack.push(word.charAt(i));
      }
         int i = 0;
         while(!stack.isEmpty())
      {
         reverseLetter[i++] = stack.pop();
      }        
      return new String(reverseLetter);

      
   }
}