import java.util.ArrayList;

public class model
{
   private ArrayList<String> names;
   
   public model()
   {
      names = new ArrayList<>();   
   }
   public String getNames()
   {
      String output = "";
      for(int i = 0; i < names.size(); i ++)
      {
         output+= names.get(i) + "\n";
      }
      return output;
   }
   
   public void addNames(String n)
   {
      names.add(n);
   }
  
}