package day200622;

import java.util.Arrays;

public class Targilkita {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];

		arr[1][3] = 100;
		arr[2][0] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		// deep to string - for multi dimensional arrays
		System.out.println(Arrays.deepToString(arr));
	}

}
