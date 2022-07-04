package day300622;

public class Point {
	// attributes
	private int x;
	private int y;
	
	// constructor 1 to create empty point (0,0) by default
	public Point() {
		
	}
	// constructor 2 to create point with setting x and y
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
// Methods	
	// it's possible to generate getters and setters automatically in Source
	public void setX(int x) {
		if(x>=0 && x<=100)
			this.x = x;
	}
//	public void setX(int xPoint) {
//		if(xPoint>=0 && xPoint<=100)
//		x = xPoint;
//	}
	public int getX() {
		return x;
	}
	public void setY(int yPoint) {
		if(yPoint>=0 && yPoint<=100) {
			y = yPoint;
		}
	}
	public int getY() {
		return y;
	}
	
	public String display() {
		return "("+x+","+y+")";
	}

}
