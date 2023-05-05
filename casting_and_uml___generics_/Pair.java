public class Pair <A,B>
{
   private A first;
   private B second;
   
   public Pair(A first,B second)
   {
      this.first = first;
      this.second = second;
   }
   
   @Override
   public String toString()
   {
      return String.format("First:%s Second:%s",first.toString(),second.toString());
   }


   public A getFirst()
   {
      return first;
   }
   public B getSecond()
   {
      return second;
   }
   }
   
   