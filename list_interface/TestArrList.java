import java.util.List;

public class TestArrList
{
   public static void main(String[] args)
   {
      List<String> words = new ArrList<>(5); //5 makes the size 5
      List<Integer> numbers = new ArrList<>();//uses the default size 10
      //myList.add("whatever");   
      
      String a =" ";
      for(int i  = 64 ; i < 64 + 7; i++)
      {
         a = a + (char)i;
         words.add(a);
      }
      for(int i = 21 ; i < 78  ; i++)
      {
         numbers.add(i);        
      }
      words.add(2,"whatever");
      numbers.add(3,-15);
   }
}