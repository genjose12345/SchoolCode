import java.util.Scanner;
public class ChapterSevenPraticeProblemsFour
{
   public static void main(String[] args)
   {
      Scanner In = new Scanner(System.in);
      System.out.println("please select 1 for park view");
      System.out.println("2 for golf course view");
      System.out.println("or 3 for lake view ");
      int select = In.nextInt();
      int condos = 150000;
      int condoGolf = 170000;
      int condoLake = 210000;

      
      
      System.out.println("select 1 if yhou would like a garage or 2 parking space");
      int GarageorParking = In.nextInt();
      
      
      if(select == 1)
      {
            
       if(GarageorParking == 1 ||  GarageorParking == 2)
      {      
         System.out.printf("you selected condos with garage the price is %d",condos + 5000);
      }
         System.out.println("you selected 1 price of the condos are $150,000");
      }     
      if(select == 2)
      {           
      if(GarageorParking == 1 ||  GarageorParking == 2)
      {
         System.out.printf("you selected condo with golf veiw grage view price is %d%n",condoGolf+5000);
      }
         System.out.println("you selected 2 price of condos with gold course view is $170,000");
      }
      if(select == 3)
      {
      if(GarageorParking == 1 ||  GarageorParking == 2)
      {
         System.out.printf("you selected cond with lake veiw and garage parking price is %d",condoLake+5000);
      }

         System.out.println("you selected 3 price of condos with lake view is 210,000");
      }
   }
}