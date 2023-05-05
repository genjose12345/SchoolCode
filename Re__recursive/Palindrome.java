public class Palindrome
{
   public static void main(String[] args)
   {
      System.out.println(isPalindrome("radar"));
      System.out.println(isPalindrome("racecar"));
      System.out.println(isPalindrome("whatever"));
      System.out.println(isPalindrome("madamimaddam"));
      System.out.println(isPalindrome("asdbwqidiwbaibds"));
      System.out.println(isPalindrome("hellow"));
   }
   public static boolean isPalindrome(String word)
   {
      if(word.length() < 2)
      {
         return true;
      }
      else
      {
         return word.charAt(0) == word.charAt(word.length() - 1) && 
         isPalindrome(word.substring(1,word.length() -1));
      }
   }
}