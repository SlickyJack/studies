package day200622;

import java.util.Arrays;

public class Targilkita2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] { 0, 0, 0 };
		arr[1] = new int[] { 0, 0, 0, 100, 0 };
		arr[2] = new int[] { 30, 0 };

		// deep to string - for multi dimensional arrays
		System.out.println(Arrays.deepToString(arr));
	}

}
