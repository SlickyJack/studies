package b;

public class Person {
	// class variable - static
	private static int counter; // in this case we have to create method get for counter to be able to get the value from them
	// constant (static + final)
	public static final int MAX_AGE = 120;
	
	// class method - static
	public static int getCounter() {
		return counter;
	}
	
	
	// instance variables
	public final int id;  // final attribute have to be instanced via constructor and can't be changed. 
	//this why we don't need setters and we can make them public and delete getter
	private int age;
	private String name;
	
	// class initialiser - runs on class load (to heap)
	static{
		System.out.println("class loaded");
	}
	
	{// instance Initialiser (block) can be more then one - runs before constructors 
		counter++;
		System.out.println("instance created");
	}
	
	
	// constructors
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age); // changing this for make them go throughout setAge max age check
	}
	
	// instance methods
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= MAX_AGE) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
