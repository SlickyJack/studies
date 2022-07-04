package day230622;

public class Demo7ArrayDimensions {

	public static void main(String[] args) {
		
		{// 2 dimensional array - static initialization
		int [][] arr = {{1, 2, 3},{2, 4, 6, 8, 0},{1,1}};
		for (int[] currArr : arr) {
			System.out.println(currArr + " - ");
			for(int x : currArr) {
				System.out.println(x);
			}
		}
		}
		{// 2 dimensional array - dynamic initialization
			int [][] arr = new int [3][];
			arr[0] = new int [3];
			arr[0][0] = 1;
			arr[0][1] = 2;
			arr[0][2] = 3;
			arr[1] = new int [3];
			arr[1][0] = 4;
			arr[1][1] = 5;
			arr[1][2] = 6;
			arr[2] = new int [3];
			arr[2][0] = 7;
			arr[2][1] = 8;
			arr[2][2] = 9;
		}
	}

}
