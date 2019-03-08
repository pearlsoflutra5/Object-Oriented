/*
Kacie Rae
3-1-19
Exercise 13.7 creating a square class implements and uses abstract classes.

--------------------------------------------------
				AbstractGeometricObject
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

---------------------
Colorable <<interface>>
---------------------
+ howToColor(): void
---------------------

-----------------------------------------------------------
Square Extends AbstractGeometricObject Implements Colorable
-----------------------------------------------------------
- side: double
-----------------------------------------------------------
+ Square()
+ Square(side:double)
+ getSide(): double
+ setSide(): double
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
------------------------------------------------------------


*/

public class Square extends AbstractGeometricObject implements Colorable {
	private double side;
	
	public Square() {
		this.side = 1;
	}
	public Square(double side){
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side = side;
	}
	
	
	
	@Override
	public double getArea() {
		return side * side;
	}
	/** Return perimeter */
	@Override
	public double getPerimeter() {
		return 4 * side;
	}
	@Override
	public void howToColor(){
		System.out.println("Color all four sides.");

	}
	


}