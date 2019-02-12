/*
Kacie Rae
2-8-19
Exercise 11.1 creating a triangle class using it as a child class and calling supers from them.

--------------------------------------------------
				GeometricObject
--------------------------------------------------
- color: String
- filled: boolean
- dateCreated: java.util.Date
--------------------------------------------------
+ GeometricObject()
+ GeometricObject(color: String, filled: boolean)
+ getColor(): String
+ setColor(color: String): void
+ isFilled(): boolean
+ setFilled(filled: boolean): void
+ getDateCreated(): java.util.Date
+ toString(): String
--------------------------------------------------

---------------------------------
Triangle Extends GeometricObject
---------------------------------
- side1:double
- side2:double
- side3:double
---------------------------------
+ Triangle()
+ Triangle(side1: double, side2:double, side3:double)
+ getSide1(): double
+ getSide2(): double
+ getSide3(): double
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
*/



class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		super();
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;	
	}
	public Triangle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled){
			super(color, filled);
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	
	public double getSide1(){
		return this.side1;
	}
	public double getSide2(){
		return this.side2;
	}
	public double getSide3(){
		return this.side3;
	}
	public double getArea(){
		double s = getPerimeter() / 2; 
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;
	}
	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
		
	}
	public String toString(){
		return "Triangle: \nside1 = " + side1 + " \nside2 = " + side2 + " \nside3 = " + side3 + "\nperimeter = " + getPerimeter() + "\narea = " + getArea() + "\n" + super.toString();
	}
}