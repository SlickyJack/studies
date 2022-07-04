package day200622;

import java.util.Arrays;

public class Lab10targil4 {

	public static void main(String[] args) {
		// create students and thier's grades
		int[][] students = new int[20][10];
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				int grade = (int) (Math.random() * 21 + 80);
				students[i][j] = grade;
			}
		}
		for (int k = 0; k < students.length; k++) {

			System.out.println(Arrays.toString(students[k]));
		}
		int classSum = 0;
		int[] sum = new int[students.length];
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				sum[i] = sum[i] + students[i][j];
				classSum = classSum + students[i][j];
			}
		}
		for (int s = 0; s < students.length; s++) {

			System.out.println("Student " + (s+1) + " average grade is " + sum[s] / students[s].length);
		}
		System.out.println("All students average is " + classSum / (students.length * students[0].length));
	}

}
