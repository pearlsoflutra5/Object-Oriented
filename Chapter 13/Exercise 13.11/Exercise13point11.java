/*
Kacie Rae
3-1-19
Exercise 13.7 creating 5 objects from the AbstractGeometricObject class, printing out their and implementing Colorable/howToColor().
*/

class Exercise13point11 {
	public static void main(String[] args) {

		Octagon octagon1 = new Octagon(9.76);
		
		System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + "\nPerimeter: " + octagon1.getPerimeter());

		System.out.println("Octagon Cloned");
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}