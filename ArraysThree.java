public class ArraysThree
{
   public static void main(String[] args)
   {
      int[] a1 = {1,2,3,4,5,6,13,8};
      int[] a2 = {8,7,6,5,3,4};
      int[] a3 = new int[0];
      System.out.println(sumThirteen(a1));
      System.out.println(sumThirteen(a2));
      System.out.println(sumThirteen(a3));
   }
   public static int sumThirteen(int[] a)
   {
      if(a.length < 1)
      {
         return 0;
      }
      int total = 0;
      for(int i = 0; i < a.length; i++)
      {
         if (a[i] == 13)
         {
            continue;
         }
         if(i != 0 && a[i-1] == 13)
         {
            continue; 
         }
         total = total + a[i];         
      }
      return total;
   }
}