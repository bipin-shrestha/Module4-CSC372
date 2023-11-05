
public class Triangle extends Shape {
	//Declaring variables
	private double side1;
	private double side2;
	private double side3;
	//Creating parameterized constructor
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}	
	//Creating area method of Triangle 
	public double area() {
		double semiPerimeter = (side1+side2+side3)/2;
		double totalArea = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
		return totalArea;
	}
	//Creating perimeter of the Triangle
	public double perimeter() {
		return side1 + side2 + side3;
	}
	//Creating toString method to print the area and perimeter of the Triangle
	public String toString() {
		return "Area of Triangle : " + area()+
			   "\nPerimeter of Triangle : " + perimeter();
	}
}
