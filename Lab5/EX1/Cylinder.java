
public class Cylinder extends Circle{
	private double height = 1;
	
	public Cylinder() {}
	
	public Cylinder(double height) {
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		return 2 * PI * radius * height + 2 * PI * radius * radius;
	}

	public double getVolume() {
		return super.getArea() * height;
	}
	
	@Override
	public String toString() {
		return "Cylinder: radius = " + radius + ", height = " + height + ", color = " + color;
	}
}
