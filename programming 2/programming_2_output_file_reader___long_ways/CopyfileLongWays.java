import java.io.FileInputStream; /* could do java.io* instead to stop all erros */
import java.io.FileNotFoundException;//must import exception when catch / fixings
import java.io.IOException;//must import exception when catching / fixing// 
public class CopyfileLongWays
{  
   public static void main(String[]args)
   {
      FileInputStream fr = null;//fixes issue on line 32
      
      try /*trys to run something / do something */
      {
       fr = new FileInputStream("1234.jpg");        /*causes erros must add catch methoed*/  
       
       int value = fr.read(); /*causes another exception */
       
       while(value != -1)//will read out the file in ints
       {
          System.out.println(value);
          value = fr.read();
       }
      }
      
      catch(FileNotFoundException e) /*what it should do if that exception comes up */
      {
         System.out.println("file not found!");
      }  
      
      catch(IOException e)
      {
         System.out.println("IOEception occurred");
      }
      
      finally //to close  must use finally and fr.close()
      {
         try
         { 
            if(fr != null)
            fr.close();
           // fr.close(); //fr will not be reconized due to scope of the methoed must fix must call in main methoed "fr" and causes exception must be put in try anc catch block
         }  
         
         catch(IOException e)
         {
            System.out.println("something went wrong");
         }   
      }
      
   }
}