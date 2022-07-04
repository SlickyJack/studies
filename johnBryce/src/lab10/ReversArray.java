package lab10;

public class ReversArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int n = arr.length;
		for (int i = 0; i < n; i++)
			// printing array elements
			System.out.print(arr[i] + " ");
		System.out.println();
		int[] temp = new int[n];
		for (int j = 0; j < n; j++) {
			temp[n - 1 - j] = arr[j];
		}
		for (int z = 0; z < arr.length; z++) {
			arr[z] = temp[z];
		}
		for (int x = 0; x < n; x++)
			System.out.print(arr[x] + " ");
	}

}
