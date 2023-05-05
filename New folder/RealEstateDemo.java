public class RealEstateDemo
{
   public static void main(String[] args)
   {
      SingleFamilyDwelling r1 = new SingleFamilyDwelling("3408",350.20,1200);
      SingleFamilyDwelling r2 = new SingleFamilyDwelling("dalton",349.30,1500);
      MultipleFamilyDwelling  r3 = new MultipleFamilyDwelling("Mexico",987.23,20);
      MultipleFamilyDwelling  r4 = new MultipleFamilyDwelling("texas",389.90,13);
      
      RealEstateProperty[] r5 = {r1,r2,r3,r4};
      for(RealEstateProperty r6 : r5)
      {
         System.out.println(r6);
      }
   }
}