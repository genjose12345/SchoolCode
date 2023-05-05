public class LabCourse extends CollegeCourse
{
   int fee = 0;
   int labfee = 0;
 
   public LabCourse(String department,int courseNumber,int creditHours)
   {
      super(department,courseNumber,creditHours);
      fee = creditHours * 120;
       labfee = fee + 50;
      
   }
    
   public void display()
   {
        
      System.out.println("Department name:" + getDepartment());
      System.out.println("course Number:" + getCourseNumber());
      System.out.println("credit Hours "+ getCreditHours());
      System.out.println("Course has been updated to labcourse 50$ fee has been added");
      System.out.println("total fee " + labfee);
      
      
      //System.out.println("This has been update to a lab course 50$ has been added to total fee");
     // System.out.println(String.format("The class is:%s the course number is:%d the credit hours is:%d and the fee is:%d",department,courseNumber,creditHours,labfee));
   }
}