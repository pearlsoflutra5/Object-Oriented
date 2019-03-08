import java.awt.*;

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

----------------------------
Comparable <<interface>>
----------------------------
+ compareTo(o: Object): int 
----------------------------

---------------------------
Cloneable <<interface>>
---------------------------
+ clone(): Object
---------------------------

-----------------------------------------------------------
Octagon Extends AbstractGeometricClass implements Comparable, Clonable
-----------------------------------------------------------
- side: double
-----------------------------------------------------------
+ Octagon()
+ Octagon(side: double)
+ getSide(): double
+ setSide(): double
+ getArea(): double
+ getPerimeter() : double
+ toString(): String
+ compareTo(): int
+ clone() 
------------------------------------------------------------
*/

class Octagon extends AbstractGeometricObject implements Cloneable,  Comparable<Octagon> {
	private double side;
	
	Octagon(){
		side = 1;
	}
	Octagon(double side){
		this.side = 1;
	}
	
	@Override
	public double getArea() {
		double area = ((2 + (4 / Math.sqrt(2.0))* side * side));
		return area;
	}
	/** Return perimeter */
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	// Implement the compareTo method defined in Comparable
	@Override  
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	} 
	
	/** Override the protected clone method defined in the Object class, and strengthen its accessibility */ 
	@Override 
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}

}