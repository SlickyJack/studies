package arrays;

public class Arrays2DTargil10 {

	public static void main(String[] args) {
		int [] lineSums = new int [10];
		int [] columnSums = new int [10];
		int [] diagonalSums = new int [2];
		int [][] nums = new int [10][10];
		for(int i = 0; i < nums.length; i++) {
			for(int j =0; j < nums[i].length; j++) {
				nums[i][j] = (int)(Math.random()*10);
				System.out.print(nums[i][j]+ " ");
				lineSums[i] = lineSums[i] + nums[i][j];
			}System.out.println();		
			System.out.println("line " + (i+1) + " sum is " + lineSums[i]);
		}
		for(int y = 0; y < nums[0].length; y++) {
			for(int x = 0; x < nums.length; x++) {
				columnSums[y] = columnSums[y]+nums[x][y];
				if(y == x) {
					diagonalSums[0]= diagonalSums[0] + nums[x][y];
				}
				if(y == 9-x) {
					diagonalSums[1]= diagonalSums[1] + nums[x][y];
				}
			}
			System.out.println("column " + (y+1) +" sum is " + columnSums[y]);
		}
		for(int z = 0; z < diagonalSums.length; z++) {
			System.out.println("The diagonal " + (z+1) + " sum is " + diagonalSums[z] );
		}
		
	}

}
