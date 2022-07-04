package day230622;

public class Demo6ArraysItteration {

	public static void main(String[] args) {
		int [] arr = {4, 6, 8, 2, 4, 8, 9};
		// iterate the array with for loop 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("=====================");
		
		// iterate with while loop
		int i =0; 
		while (i < arr.length) {
			int currentElement = arr[i];
			System.out.print(currentElement);
			i++;
		}
		System.out.println();
		System.out.println("=====================");
		
		
		// iterate the array with for-each loop
		for(int currentElement : arr) {
			System.out.print(currentElement);
		}
	}

}
