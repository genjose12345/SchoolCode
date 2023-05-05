public class ArraysSeven
{
   public static void main(String[] args)
   {
      int[] nums = {2, 4, 5, 1, 2};
      int total = 0;
      for(int i = 0; i< nums.length; i++)
      {
         total = nums[i] + total;
      }
      System.out.println(total);
   }
}