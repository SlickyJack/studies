package a;

public class Test {

	public static void main(String[] args) {
		Point p = new Point();
		
		// we can not access to a private members
//		p.x = 9; //error
		
		
		//we can access 'description' because it is public
		p.description = "this is a point";
		System.out.println(p.description);
		
		// move the point 
		int theValueOfX = p.moveRight(5);
		System.out.println(theValueOfX);
		theValueOfX = p.moveLeft(10);
		System.out.println(theValueOfX);
		
		
		// print a string description of the point 
		String pointDescription = "point(x=" + p.getX() + " y=" + p.getY()+")";
		System.out.println(pointDescription);
		
		pointDescription = p.getDetails();
		System.out.println(pointDescription);
	}

}
