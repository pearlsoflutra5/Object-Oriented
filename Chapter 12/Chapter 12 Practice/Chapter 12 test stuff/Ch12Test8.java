class Ch12Test8 {
	public static void main(String[] args) {
		Object circle1 = new Circle();
		Object circle2 = new Circle();
		System.out.println(circle1.equals(circle2));
	}
}

class Circle {
	double radius;
	
	public boolean equals(Circle circle) {
		return this.radius == circle.radius;
	}
}
		
