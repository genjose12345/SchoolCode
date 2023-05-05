import java.util.ArrayList;
import java.io.Serializable;

public class PaintModel
{
   private String color;
   private ArrayList<Rectangle> rectangles;
   
   public PaintModel(String color)
   {
      this.color = color;
      rectangles = new ArrayList<>();
      System.out.println(this.color);
      
   }
   
   public void add(Rectangle r)
   {
      rectangles.add(r);
      System.out.println(rectangles);
   }
   public String getColor()
   {
      return color;
   }
   public void setColor(String color)
   {
      this.color = color;
   }
   public void clearRectangles()
    {
      rectangles = new ArrayList<>();
    }
}