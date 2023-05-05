public class TestStack
{
   public static void main(String[]args)
   {      
      MyStack<String> stack = new MyStack<>();
      
      stack.push("a");
      stack.push("e");
      stack.push("B");
      stack.push("R");
      System.out.println(stack.peek());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
   // System.out.println(stack.pop());
      System.out.println(stack.peek());
      
   }
}