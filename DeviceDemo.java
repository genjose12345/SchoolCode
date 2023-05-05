public class DeviceDemo
{
   public static void main(String[]args)
   {
      Desktop d1 = new Desktop("razor",25.99,32.0);
      Desktop d2 = new Desktop("intel",29.99,16.0);
      Tablet d3 = new Tablet("nivida",30.22,25.7);
      Tablet d4 = new Tablet("alienware",45.99,25.8);
      
      Device[] d5 = {d1,d2,d3,d4};
      for(int i = 0; i<d5.length ; i++)
      {
         System.out.println(d5[i]);
      }
   }
}