package lab10;

import java.util.Arrays;

public class Targil4 {

	public static void main(String[] args) {
		int[][] students = new int [10][10];
		
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students[i].length; j ++) {
				students[i][j] = (int)(Math.random()*21+80);
			}
		}
		System.out.println(Arrays.deepToString(students));
		int [] grades = new int [10];
		int classSum=0;
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students[i].length; j ++) {
				grades[i] = grades[i] + students[i][j];
			}
			classSum = classSum + grades[i];
			System.out.println("student "+ (i+1) + " average is " + (double)grades[i]/grades.length);
		}
		System.out.println("Class average is " + classSum/(double)(students.length*students[0].length));
		
	}

}
