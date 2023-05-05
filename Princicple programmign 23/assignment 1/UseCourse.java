import java.util.Scanner;
public class UseCourse
{
   
   
   public static void main(String[]args)
   {
       
      Scanner in = new Scanner(System.in);  
      System.out.println("Enter Department");
      String department = in.nextLine();    
      
      System.out.println("Enter Course number");
      int course = Integer.parseInt(in.nextLine());   
      
      System.out.println("Enter credit Hours");
      int CreditHours = in.nextInt();
    
    if(department.equals("BIOL") ||department.equals("CHEM") ||department.equals("CMPS") ||department.equals("PHYS"))
    {
      LabCourse c1 = new LabCourse(department,course,CreditHours);  
      c1.display();
    }
    else
    {
      CollegeCourse c1 = new CollegeCourse(department,course,CreditHours); 
      c1.display();
    }
    
   
   }
   
}