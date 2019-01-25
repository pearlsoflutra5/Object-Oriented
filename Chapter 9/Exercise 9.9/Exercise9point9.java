class Exercise9point9 {
	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon(6, 4);
		RegularPolygon p2 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("The perimeter of p1 is: " + p1.getPerimeter());
		System.out.println("The area of p1 is: " + p1.getArea());
		System.out.println("The perimeter of p2 is: " + p2.getPerimeter());
		System.out.println("The area of p2 is: " + p2.getArea());

	}
}