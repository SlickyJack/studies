package a;

public class Test2 {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		
		p2.moveDown(5);
		p1.moveUp(6);
		
		System.out.println("p2="+p2.getDetails());
		System.out.println("p1="+p1.getDetails());
	}

}
