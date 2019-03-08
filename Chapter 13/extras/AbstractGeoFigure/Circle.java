public class Circle	extends GeometricObject implements Rollable {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, 
			String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** Return perimeter */
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/* Print the circle info */
	@Override
	public String toString() {
		return (super.toString() + "\nThe circle is created " + getDateCreated() +
			" and the radius is " + radius);
	}
	
	@Override
	public boolean doesRoll() {
		return true;
	}
}