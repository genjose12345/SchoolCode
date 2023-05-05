public class CollegeCourse
{
   protected  String department;
   protected int courseNumber;
   protected int creditHours;
   int  fee = 0;
   
   public CollegeCourse(String department, int courseNumber, int creditHours)
   {
      this.department = department;
      this.courseNumber = courseNumber;
      this.creditHours = creditHours;
      fee = creditHours * 120;
   }
   
   public String getDepartment()
   {
      return department;
   }
   public int getCourseNumber()
   {
      return courseNumber;
   }
   public int getCreditHours()
   {
      return creditHours;
   }
   
   public void setDepartment(String department)
   {
      this.department = department;
   }
   public void setCourseNumber(int courseNumber)
   {
      this.courseNumber = courseNumber;
   }
   public void setCreditHours(int creditHours)
   {
      this.creditHours = creditHours;
   }
   
   public void display()
   {
      System.out.println("Department name:" + getDepartment());
      System.out.println("course Number:" + getCourseNumber());
      System.out.println("credit Hours"+ getCreditHours());
      System.out.println("total fee" + fee);
      
      
     // System.out.println(String.format("The class is:%s the course number is:%d the credit hours is:%d and the fee is:%d",department,courseNumber,creditHours,fee));
   }
   
}