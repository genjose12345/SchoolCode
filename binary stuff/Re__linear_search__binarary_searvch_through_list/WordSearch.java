import java.util.*;
import java.io.*;
import java.net.*;

public class WordSearch
{
   public static void main(String[]args) throws MalformedURLException,  IOException
      {
      ArrayList<String> words = new ArrayList<>();
      
      URL url = new URL("https://www.mit.edu/~ecprice/wordlist.10000");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine = in.readLine();
      while(inputLine != null)
      {
         words.add(inputLine);
         inputLine = in.readLine();
      }
      Collections.shuffle(words);
      System.out.println(words);
      
      OrderedList<String> ordWords = new OrderedList<>();
      
      for(String word: words)
      {
         ordWords.insert(word);
      }
      
     // System.out.println(ordWords);
     long startTime = 0;
     long endTime = 0;
     startTime = System.nanoTime();
     
     for(String word: words)
     {
     System.out.println(ordWords.sequenialSearch(words.get(0)));
     }
     
     endTime = System.nanoTime();
     long seqelapsedTime = (endTime - startTime) / 1000000;
     
     
     
     startTime = System.nanoTime();

     for(String word:words)
     {
     System.out.println(ordWords.binarySearch(words.get(0)));
     }   
     
     endTime = System.nanoTime();
     long elapsedTime = (endTime - startTime) / 1000000;
     
     System.out.printf("time for sequential search in milliseconds: %d%n", seqelapsedTime);
     System.out.printf("time for binarysearch search in milliseconds: %d%n", elapsedTime);
     
   }
}