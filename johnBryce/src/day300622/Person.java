package day300622;

public class Person {
	
	// attributes
	private int id;
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String theNewName) {
		if(theNewName.length() <=10 ) {
			name = theNewName;
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int x) {
		if(x >= 0 && x <= 999999999) {
			id = x;
		}
	}
	
	// access
	public int getAge() {
		return age;
	}
	// mutate(change)
	public void setAge(int x) {
		if(x >=0 && x <= 120) {
			age = x;
		}
	}
}
