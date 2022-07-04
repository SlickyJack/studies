package day300622;

public class App {

	public static void main(String[] args) {

//		// create person instance
//		Person person = new Person();
//		
//		// set the object state
//		person.setId(1111);
//		person.setName("Moshe");
//		person.setAge(25);
//		System.out.println(person.getId());
//		System.out.println(person.getName());
//		System.out.println(person.getAge());
		
		// create by constructor 1
		Point point = new Point();
		// create by constructor 2
		Point point2 = new Point(1,6);
		System.out.println("("+point.getX()+","+point.getY()+")");
		point.setX(3);
		point.setY(7);
		System.out.println(point.display());
		System.out.println(point2.display());
		
	}

}
