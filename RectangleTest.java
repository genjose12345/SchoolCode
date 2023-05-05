package exercise_rectangle_equals;

public class RectangleTest {

	public static void main(String[] args) {
		testEquals();
	}
	
	public static void testEquals() {
		System.out.println("-->testEquals()");
		Rectangle r1 = new Rectangle(2.0,4.0);
		Rectangle r2 = new Rectangle(2.0,5.0);
		Rectangle r3 = new Rectangle(1.95,4.06);
		
		String msg = String.format("r1.area()=%.2f, r2.area()=%.2f, r3.area()=%.2f", 
				r1.area(), r2.area(), r3.area());
		System.out.println(msg);
		System.out.println("r1.equals(r2)=" + r1.equals(r2));
		System.out.println("r1.equals(r3)=" + r1.equals(r3));
	}
}
