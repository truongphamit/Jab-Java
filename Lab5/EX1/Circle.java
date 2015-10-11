
public class Circle {
	public static final double PI = 3.14; 
	protected double radius = 1;
	protected String color = "red";
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
	
	@Override
	public String toString() {
		return "Circle: radius = " + radius + ", color = " + color;
	}
}
