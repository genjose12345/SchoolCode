public class MultipleFamilyDwelling extends RealEstateProperty
{
      private int numberUnits;
      
      public MultipleFamilyDwelling(String address, double price,int numberUnits)
      {
         super(address,price);
         this.numberUnits = numberUnits;
      }
      public String toString()
      {
      return String.format("%s Number Of Units:%d",super.toString(),numberUnits);
      
      }
      public void setNumberUnits(int numberUnits)
      {
         this.numberUnits = numberUnits;
      }
      public int getNumberUnits()
      {
         return numberUnits;
      }
   
}