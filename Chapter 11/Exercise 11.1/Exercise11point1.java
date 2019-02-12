/*
Kacie Rae
2-12-19
Exercise 11.1 calling the triangle class and testing all methods. 
*/
import java.util.Scanner;

class Exercise11point1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		String color = "";
		boolean filled = false;
		
		System.out.print("Enter the length of side 1: ");
		s1 = input.nextDouble();
		System.out.print("Enter the length of side 2: ");
		s2 = input.nextDouble();
		System.out.print("Enter the length of side 3: ");
		s3 = input.nextDouble();
		System.out.print("Enter color: ");
		input.nextLine(); // clears input for nextLine() method. 
		color = input.nextLine().trim();
		System.out.print("Is it filled (true/false): ");
		filled = input.nextBoolean();
		
		System.out.println("");
		Triangle triangle = new Triangle(s1, s2, s3, color, filled); // to set color and filled can also use triangle.setColor as well
		System.out.println(triangle.toString());
	}
}