public class TestWeeklyData
{
   public static void main(String[]args)
   {
      WeeklyData <String> words = new WeeklyData<>();
      WeeklyData <Double> numbers = new WeeklyData<>();
      String blah = "a";
      
      for(int i = 0; i < 10; i++)
      {
      words.add(blah);
      blah = blah + "a";
      }
      for(int i = 0; i < 10; i++)
      {
      numbers.add(Math.PI / Math.pow(10,i));
      
      }
      System.out.println(words);
      System.out.println(numbers);

   }
   
}