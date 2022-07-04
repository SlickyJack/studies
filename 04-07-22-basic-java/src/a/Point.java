package a;

public class Point {

	// private attributes
	private int x;
	private int y;
	// public attribute
	public String description;
	
	// create point at 0,0
	public Point() {
		
	}
	
	// create point at specified location
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	// create at specified location where x, y are same
	public Point(int val) {
//		this.x = val;
//		this.y = val;
		// other better way for create point with same x and y by calling another constructor in this class
		this(val,val);
	}
	
	// methods
	// move the point to the right
	public int moveRight(int units) {
		x = x + units;
		return x;
	}
	//move the point to the left
	public int moveLeft(int units) {
		x = x - units;
		return x;
	}
	// move point up
	public int moveUp(int units) {
		y = y + units;
		return y;
	}
	//move the point to the left
	public int moveDown(int units) {
		y = y - units;
		return y;
		
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public String getDetails() {
		return "(" + x + ", " + y + ")" ;
	}

}
