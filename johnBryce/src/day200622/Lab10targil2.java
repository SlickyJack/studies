package day200622;
import java.util.Arrays;

public class Lab10targil2 {

	public static void main(String[] args) {
		
		//create an array of random length
		int length = (int)(Math.random()*6)+10;
		int [] arr = new int[length];
		// populate with random values
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr));
		
		//eliminate duplicates 
		int[] arrTemp = new int [arr.length];
		int index = 0;
		lbl: for(int j = 0; j < arr.length; j++) {
			int candidate = arr[j];
			for(int x = 0; x < index; x++) {
				if (candidate == arrTemp[x]) {
					continue lbl;
				}
			}
			arrTemp[index++] = candidate;
		}
		System.out.println(Arrays.toString(arrTemp));
		
		//create new short array
		int[] arrShort = new int [index];
		System.arraycopy(arrTemp, 0, arrShort, 0, index);
		System.out.println(Arrays.toString(arrShort));
	}

}
