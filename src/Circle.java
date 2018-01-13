
public class Circle extends Shape {
	private double radius;
	private double area; 
	
	public Circle( ) {
		super();
		radius = 0.0;
	}
	
	public Circle(double r) {
		super();
		setRadius(r);
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}
