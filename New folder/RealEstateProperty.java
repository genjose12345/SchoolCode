public class RealEstateProperty
{
   protected String address;
   protected double price;
   
   public RealEstateProperty(String address, double price)
   {
      this.address = address;
      this.price = price;
   }
   
   @Override
   public String toString()
   {
      return String.format("Address: %s Price: %.2f",address,price);
   }
   
   public void setAddress(String address)
   {
      this.address = address;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   public String getAddress()
   {
      return address;
   }
   public double getPrice()
   {
      return price;
   }
   
}