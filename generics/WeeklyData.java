public class WeeklyData<T>
{
   //fields
   private T[] data;
   private int currentIndex;
   
   //constructor
   @SuppressWarnings("unchecked") //gets rid of wanring 
   public WeeklyData()
   {
      currentIndex = 0;
      //sets size to 7 must use new object 
      //must add (T[]) otherwise unsafe and won't work
      data = (T[]) new Object[7];
   }
   
   //method add
   public void add(T item)
   {
      data[currentIndex] = item; //adds currentIndext value to array data
      currentIndex =(currentIndex + 1) % 7;
   }
   
   //get
   public T[] getData()
   {
      return data;
   }
   
   //toString
   public String toString()
   {
      String out = " ";
      for(T datum : data)
      {
         out = out + datum.toString() + " ";
      } 
      return out;
   }
}