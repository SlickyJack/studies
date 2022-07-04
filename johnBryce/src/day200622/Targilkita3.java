package day200622;

import java.util.Arrays;

public class Targilkita3 {

	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 0 }, { 0, 0, 0, 100, 0 }, { 30, 0 } };

		System.out.println(Arrays.deepToString(arr));

		int[][] arr2 = { new int[3], { 0, 0, 0, 100, 0 }, { 30, 0 } };
		System.out.println(Arrays.deepToString(arr2));
	}

}
