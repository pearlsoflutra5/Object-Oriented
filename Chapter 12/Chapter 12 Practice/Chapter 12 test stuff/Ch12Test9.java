class Ch12Test9 {
	public static void main(String[] args) {
		Object circle1 = new Circle();
		Object circle2 = new Circle();
		System.out.println(circle1.equals(circle2));
	}
}

class Circle {
	double radius;
	
	public boolean equals(Object circle) {
		return this.radius ==((Circle)circle).radius;
	}
}

	
		
	