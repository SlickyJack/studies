package Arrays2D;

public class targil9 {
	public static void  main(String[] args) {
		int[][] arr = new int[10][10];
		int start = 0;
		int end = arr.length;
		for (int i = 1; i <= 5; i++) {
			for (int j = start; j < end; j++) {
				for (int k = start; k < end; k++) {
					arr[j][k] = start + 1;
				}
			}
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

}
