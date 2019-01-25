/*
Kacie Rae 
1-17-19
Exercise 9.1 calling the Rectangle class, printing out height, width, area, and perimeter
*/
class Exercise9point1 {
	public static void main(String[] args) {
		// Declare object instance variables
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
	
		
		//Display object information
		System.out.println("Rectangle 1: " + "Width:" + rect1.width + "\tHeight:" + rect1.height + "\tArea:" + rect1.getArea() + "\tPerimeter:" + rect1.getPerimeter());
		
		System.out.println("");
		
		System.out.println("Rectangle 2: " + "Width:" + rect2.width + "\tHeight:" + rect2.height + "\tArea:" + rect2.getArea() + "\tPerimeter:" + rect2.getPerimeter());
	
		

		


	}
}