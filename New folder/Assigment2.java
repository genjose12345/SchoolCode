import java.util.ArrayList;

public class Assigment2
{
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(4);
      numbers.add(5);
      numbers.add(7);
      numbers.add(2);
      
      ArrayList<Integer> numbers2 = new ArrayList<>();
      numbers2.add(2);
      numbers2.add(7);
      numbers2.add(7);
      numbers2.add(2);
      
      ArrayList<Integer> numbers3 = new ArrayList<>();
      numbers3.add(6);
      numbers3.add(9);
      numbers3.add(8);
      numbers3.add(7);
      
      ArrayList<Integer> numbers4 = new ArrayList<>();
      numbers4.add(2);
      numbers4.add(2);
      numbers4.add(2);
      numbers4.add(2);
      
      System.out.println(allTwoSeven(numbers));
      System.out.println(allTwoSeven(numbers2));
      System.out.println(allTwoSeven(numbers3));
      System.out.println(allTwoSeven(numbers4));

         }
   public static int allTwoSeven(ArrayList<Integer>a)
   {
     
       for(int i = 0; i < a.size() ;i++)
       {
         if(a.get(i) == 2 || a.get(i) == 7)
         {
         
         }
         else 
         {
            return -7;
         }
         
       }
       return 19;
   }
   
}