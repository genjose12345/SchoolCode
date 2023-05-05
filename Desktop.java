public class Desktop extends Device
{
   private double ram;
   
   public Desktop(String manufacturer,double price,double ram)
   {
      super(manufacturer,price);
       this.ram = ram;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Ram:%.2f",super.toString(),ram);
   }
   
   public void setRam(double ram)
   {
      this.ram =ram;
   }
   public double getRam()
   {
      return ram;
   }
}