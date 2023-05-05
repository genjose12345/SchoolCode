import java.util.*;

public class MapDeclarationInitialization
{
   public static void main(String[]args)
   {
      Map<Character,String> map = new HashMap<>();
      map.put('a',"apple");
      map.put('b',"butter");
      map.put('c',"whatever");
      map.put('d',"dragon");
      map.put('e',"everything");
      System.out.println(map);
      
      
      
   }
}