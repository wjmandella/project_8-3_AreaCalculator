import java.util.Scanner;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
		String entry = ConsoleAC.getString("Calculate the area of a circle, triangle, or rectangle? (c/t/r): ");
		
		double area = 0.0;
		
		Shape shape = null;
		
		if (entry.equalsIgnoreCase("c")) {
			double r = ConsoleAC.getDouble("Enter radius: ");
//			Circle c = new Circle(r);
//			area = c.getArea();
//			shape = c;
			shape = new Circle(r);
		}
		else if (entry.equalsIgnoreCase("t")) {
			double b = ConsoleAC.getDouble("Enter base: ");
			double h = ConsoleAC.getDouble("Enter height: ");
//			Square s = new Square(w);
//			area = s.getArea();
			shape = new Triangle(b,h);
		}	
		else if (entry.equalsIgnoreCase("r")) {
			double w = ConsoleAC.getDouble("Enter width: ");
			double h = ConsoleAC.getDouble("Enter height: ");
//			Rectangle r = new Rectangle(w,h);
//			area = r.getArea();
			shape = new Rectangle(w,h);
		}
		
		Class c = shape.getClass();
		
		System.out.println("The area of the " + c.getName().toLowerCase() + " is " + shape.getArea() + " square units.");
		
		choice = ConsoleAC.validateEntry(sc, "Continue?: (y/n): ", "y", "n");
		}
		System.out.println("Bye");
	}
}
