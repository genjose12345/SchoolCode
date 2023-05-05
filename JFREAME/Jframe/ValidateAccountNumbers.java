import java.nio.file.*;
import java.io.*;
public class ValidateAccountNumbers
{
   public static void main (String[]args)throws IOException
   {  
      Path file = Paths.get("AcctNumbers.txt");
      InputStream input = null;
      String acct;
      int acctNum,lastDigit,digit,sum;
      try
      {
         input = Files.newInputStream(file);
         BufferedReader reader = new BufferedReader
         (new InputStreamReader(input));
         acct = reader.readLine();
         while(acct != null)
         {
            sum = 0;
            acctNum = Integer.parseInt(acct);
            lastDigit = acctNum %  10;
            acctNum = acctNum / 10;
            for(int i = 0; i<6; i++)
            {
               digit = acctNum % 10;
               acctNum = acctNum / 10;
               sum = sum + digit;               
            }
            sum = sum % 10;
            if(sum == lastDigit)
            {
               System.out.println(acct + " is Valid");
            }
            else
            {
               System.out.println(acct + " is invlaid");
               acct = reader.readLine();
            }
            input.close();
         }
      }
      catch(IOException e)
         {
            System.out.println(e);
         }
         catch(Exception e)
         {
            System.out.println("something went wrong");
         }
      
   }
}