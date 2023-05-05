public class TestPair
{
   public static void main(String[]args)
   {
      System.out.println(new Pair<>("a",1));
      System.out.println(new Pair<>("b",2));
      System.out.println(new Pair<>("b","hi"));
      System.out.println(new Pair<>(new Blah(),6));
      
      Pair<String, Boolean> aPair = new Pair<>("1",true);
      System.out.println(aPair);
   }
}