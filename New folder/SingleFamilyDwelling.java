public class SingleFamilyDwelling extends RealEstateProperty
{  
    private double squareFeet;
      
      public SingleFamilyDwelling(String address,double price,double squareFeet)
      {
         super(address,price);
         this.squareFeet = squareFeet;
      }
     
     public String toString()
      {
         return String.format("%s SquareFeet:%.2f", super.toString(),squareFeet);
      }
      
      public void setSquareFeet(double squareFeet)
      {
         this.squareFeet = squareFeet;
      }
      public double getSquareFeet()
      {
         return squareFeet;
      }
      
   
}