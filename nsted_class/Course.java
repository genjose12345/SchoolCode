import java.util.Comparator;

public class Course
{
   //fields
   private int credits;
   private String department;
   private String number;
   //pramarter
   public Course(String department, String number, int credits)
   {
      this.department = department;
      this.number = number;
      this.credits = credits;
   }
   //nested calss / sort by credit hours
   public static class CreditComparator implements Comparator<Course>
   {
      public int compare(Course c1, Course c2)
      {
         return c1.getCredits() - c2.getCredits();
      }
   }
   //nested class to comparea id numbers
   public static class IDCompartor implements Comparator<Course>
   {
      public int compare(Course o1, Course o2)
      {
         return o1.getID().compareTo(o2.getID());//to see which one comes first
      }
   }
   //get and set
   public int getCredits()
   {
      return credits;
   }
   
   public String getID()
   {
      return department + number;
   }
   //tostring
   public String toString()
   {
      return String.format("%s%s (%d)", department, number, credits);
   }
}