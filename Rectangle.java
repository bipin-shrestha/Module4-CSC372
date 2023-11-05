
public class Rectangle extends Shape{
	//Declaring variables
	private double length; 
	private double width;
	//Created Parameterized constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	//created area method 
	public double area() {
		return length * width;
	}
	//Created perimeter method
	public double perimeter() {
		return 2 * (length + width);
	}
	//Created method to print the area and perimeter of Rectangle
	public String toString() {
		return "Area of rectangle : " + area() + 
			   "\nPerimeter of rectangle : " + perimeter();
	}
}
