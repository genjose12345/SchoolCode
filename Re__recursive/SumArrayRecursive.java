public class SumArrayRecursive
{
   public static void main(String[]args)
   {
      System.out.println(sumArray(new int [] {2,3,7,2,-1,9},0));
      System.out.println(sumArray(new int [] {2,6,8,1,8,20},0));
   }
   public static int sumArray(int[] a, int index)
   {
      if(index == a.length - 1)
      {
         return a[a.length - 1];
      }
      else
      {
         return a[index] + sumArray(a,index + 1);
      }
   }
}