/*
Kacie Rae
1-17-19
Exercise 9.1 creating a rectangle object class

UML Diagram
---------------
+ width: double
+ height: double
----------------
+ Rectangle()
+ Rectangle(width: double, height:double)
+ getArea(): double
+ getPerimeter(): double
----------------------

*/
class Rectangle {
	// Attributes- object characteristics; global variables
	// Generally attributes are not initialized unless default value
	double width = 1;
	double height = 1;
	
	// Constructors- create the object instance variable
	// Generally, no args will be first if you have one 
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		
	}
	
	public double getArea(){
		double area = this.width * this.height;
		return area;
		
	}
	public double getPerimeter(){
			double perimeter = (this.width * 2) + (this.height * 2);
			return perimeter;
			
		}
}