package exercise_rectangle_equals;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle r = (Rectangle)o;
//			double diff = Math.abs(this.area()-r.area());
//			if(diff<0.1) {
//				return true;
//			}
//			return false;
			return Math.abs(this.area()-r.area()) < 0.1;
		}
		return false;
	}

	public double area() {
		return length*width;
	}
	
	@Override
	public String toString() {
		String msg = String.format("len=%,.2f, wid=%,.2f, area=%.2f", length, width, area());
		return msg;
	}

}
