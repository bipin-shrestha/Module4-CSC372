
public class Circle extends Shape {
	//Declaring variable
	private double radius;
	//Created parameterized constructor  
	public Circle(double radius){
		this.radius = radius;
	}
	//Created area method of circle
	public double area() {
		return Math.PI + radius * radius;
	}
	//Created perimeter method of circle
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	//Created toString method to print the area and perimeter of the circle
	public String toString() {
		return "Area of circle : " + area() +
			   "\nPerimeter of cicle : " + perimeter();
	}
}
