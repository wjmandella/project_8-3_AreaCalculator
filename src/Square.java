
public class Square extends Shape{
	private double width;
	private double area;
	
	public Square() {
		super();
		width = 0.0;
	}
	
	public Square(double w)	{
		setWidth(w);
	}
		
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return width * width;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}
