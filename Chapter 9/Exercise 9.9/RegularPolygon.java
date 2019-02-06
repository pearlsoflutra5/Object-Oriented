/*
Kacie Rae
1-23-19
Exercise 9.9 creating a RegularPolygon class. 

UML Diagram
---------------
- n:int 
- side:double
- x:double
- y:double
----------------
+ RegularPolygon()
+ RegularPolygon(n:int, side:double)
+ RegularPolygon(n:int, side:double, x:double, y:double)
+ getN(): int
+ getSide(): double
+ getX(): double
+ getY(): double
+ setN(n:int)
+ setSide(side:double)
+ setX(x:double)
+ setY(y:double)
+ getPerimeter(): double
+ getArea(): double
----------------------
*/



class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public int getN(){
		return this.n;
	}
	public double getSide(){
		return this.side;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	public void setN(int n){
		this.n = n;
	}
	public void setSide(double side){
		this.side = side;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getPerimeter(){
		double perimeter = this.side * this.n;
		return perimeter;
	}
	public double getArea(){
		double area = ((this.n * (this.side * this.side)) / (4 * Math.tan(Math.PI / this.n)));
		return area; 
	}




}