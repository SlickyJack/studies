package day1306;

import java.util.Arrays;

public class ArrayNames2 {

	public static void main(String[] args) {
		String [] random = new String [100];
		String [] name = {"Dan", "Ran", "Edna", "Michal","Ofir"};
		for(int i = 0; i <100; i++) {
			random[i] = name[(int)(Math.random()*5)];
		}
		
			System.out.println(Arrays.toString(random));
	}

}
