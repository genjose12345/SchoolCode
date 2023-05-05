import java.io.*;
import java.util.*;

public class ProcessCSV
{
   public static void main(String[]args)
   {
      Map<String,String> map = new HashMap<>();
      
      try(FileReader fr = new FileReader("name_company_data.csv");
         BufferedReader br = new BufferedReader(fr))
         {
            String line = br.readLine();
            while(line != null)
            {
               //String[] parts = line.split(",");
               //System.out.println(Arrays.toString(parts));
               int commaIndex = line.indexOf(",");
              // map.put(parts[0],parts[1]);
              map.put(line.substring(0,commaIndex), line.substring(commaIndex + 1));
               line = br.readLine();
            }
         }
         catch(FileNotFoundException e)
         {
            e.printStackTrace();
         }
         catch(IOException e)
         {
            e.printStackTrace();

         }
         System.out.println(map);
         System.out.println(map.get("Sheena Gregorowicz"));
         Set<String> keys = map.keySet();
         
         for(String key :keys)
         {
            if(key.startsWith("Fred"))
            {
            System.out.println(key);
            }
         }
         Set<Map.Entry<String,String>> pairs = map.entrySet();
         for(Map.Entry<String, String> pair : pairs)
         {
            if(pair.toString().contains("LLC"))
            System.out.println(pair);
         }
   }
}