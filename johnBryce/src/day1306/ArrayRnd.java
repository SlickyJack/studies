package day1306;

import java.util.Arrays;

public class ArrayRnd {

	public static void main(String[] args) {
		int [] arr = new int [25];
		for(int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*10);
			arr[i] = n;
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	System.out.println(Arrays.toString(arr));
	}

}
