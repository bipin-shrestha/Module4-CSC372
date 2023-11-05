
public class ShapeArray {
	public static void main(String[] args) {
		Shape[] shapeArray = new Shape[3];
		
		shapeArray[0] = new Rectangle(7.5,4.5);
		shapeArray[1] = new Circle(3.6);
		shapeArray[2] = new Triangle(3.5,4.5,5.5);
		
		for(int i=0; i<shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString()+ "\n");
		}
	}
}
