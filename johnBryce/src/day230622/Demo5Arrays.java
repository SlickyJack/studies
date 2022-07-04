package day230622;

import java.util.Arrays;

public class Demo5Arrays {

	public static void main(String[] args) {
		{
			char[] arr1 = new char[3];
			arr1[0] = 'A';
			arr1[1] = 'B';
			arr1[2] = 'C';
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
		}
		{
			int [] arr = {23, 65, 17, 68};
			// access array elements (Print)
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
		}
		{
			String [] arr = {"aaa", "bbb", "ccc"};
			System.out.println(Arrays.toString(arr));
		}
	}

}
