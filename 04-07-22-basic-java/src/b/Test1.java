package b;

public class Test1 {

	public static void main(String[] args) {
		
		Person p1 = new Person(101, "Avi", 25);
		Person p2 = new Person(10101, "Ben", 32);
		Person p3 = new Person(543321, "Gabi", 53);
		System.out.println(p1.id);
		System.out.println(p3.getAge());
		
//		p1.id = 2-1; // error because id is final
		
		System.out.println(Person.getCounter());
		
	}

}
