
public class Triangle extends Shape{
	
	private double base;
	private double height;
	private double area;
	
	public Triangle() {
		super();
		base = 0.0;
		height = 0.0;
	}
	
	public Triangle(double b, double h) {
		setBase(b);
		setHeight(h);		
	}
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return (0.5)* base * height;
	}
	public void setArea(double area) {
		this.area = area;
	}

	
}
