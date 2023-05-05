import java.util.List;

public class TestArrList
{
   public static void main(String[] args)
   {
      List<String> words = new ArrList<>(5); //5 makes the size 5
      List<Integer> numbers = new ArrList<>(3);
    
      
      words.add("a");
      words.add("b");
      words.add("c");
      words.add("d");
      
      numbers.add(1);
      numbers.add(2);
      numbers.add(12);
      numbers.add(14);
      
      words.add(1 , "whgatever");
      words.add(0,"d");      
      
      System.out.println(words.size());
      System.out.println(numbers.size());
      
      System.out.println(words.get(3));
      System.out.println(numbers.get(2));
      
      System.out.println(words.set(0,"e"));
      System.out.println(numbers.set(3,45));
      
      System.out.println(words.indexOf("c"));
      System.out.println(words.indexOf("asdfds"));
      System.out.println(numbers.indexOf(12));
      System.out.println(numbers.indexOf(80));
      
      System.out.println(words.contains("c"));
      System.out.println(words.contains("asdf"));
      System.out.println(numbers.contains(12));
      System.out.println(numbers.contains(2323));
      
      words.remove(3);
      words.remove("c");
      numbers.remove(2);
      numbers.remove(new Integer(12));//removes thenumber and not the index
   }
}