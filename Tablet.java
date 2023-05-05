public class Tablet extends Device
{
   private double screenSize;
   
   public Tablet(String manufacturer, double price,double screenSize)
   {
      super(manufacturer,price);
      this.screenSize = screenSize;   
   }
   
   
   @Override
   public String toString()
   {
      return String.format("%s ScreenSize:%.2f",super.toString(),screenSize);
   }
   
   public void setRam(double screenSize)
   {
      this.screenSize = screenSize;
   }
   public double getscreenSize()
   {
      return screenSize;
   }
}