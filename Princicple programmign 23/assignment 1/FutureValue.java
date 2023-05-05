public class FutureValue
{
   public static void main(String[] args)
   {
      double principal = 123.45;
      //descriptive variable names not p or r
      double rate = 0.025;
      int compound = 4;
      int years = 12;
      //"compounded 4 times a year"
      
      double amount = principal * Math.pow(1 + rate/compound, compound * years);
      
      System.out.println("If $" + principal + " is invested at an annual interest rate of " + (rate * 100) + " percent, compounded " + compound + " times a year for " + years + " years, the future value is $" + amount + ".");
   }
}