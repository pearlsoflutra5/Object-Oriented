/*
Kacie Rae
3-1-19
Exercise 13.7 creating 5 objects from the AbstractGeometricObject class, printing out their and implementing Colorable/howToColor().
*/

public class Exercise13point7 {
	public static void main(String[] args) {
		AbstractGeometricObject[] squares = { new Square(3.2), new Square(18), new Square(43.8), new Square(8.9), new Square(2.2)};
		
		for (int i = 0; i < squares.length; i++) {
			System.out.println("\nSquare " + (i + 1));
			System.out.println("Area: " + squares[i].getArea());
			System.out.print("How to color: ");
				((Square)squares[i]).howToColor();
		} 
		
	}
}