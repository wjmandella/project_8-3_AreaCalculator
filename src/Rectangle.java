
public class Rectangle extends Shape {

	private double width;
	private double height;
	private double area;
	
	public Rectangle() {
		super();
		width = 0.0;
		height = 0.0;
	}
	
	public Rectangle(double w, double h)	{
		setWidth(w);
		setHeight(h);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}
