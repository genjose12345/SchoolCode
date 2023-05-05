public class ArraysTwo
{
   public static void main(String[] args)
   {
      int[] a1 = {2,3,4,5,6};
      int[] a2 = {1,7,8,9,3,9,8,5};
      System.out.println(avg(a1));
      System.out.println(avg(a2));
   }
   public static int avg(int[] a)
   {
      int average = (a[0] + a[a.length -1]) / 2;
      return average;
   }
   
}