package day200622;

import java.util.Arrays;

public class Targilkita4 {

	public static void main(String[] args) {
		String[] names = { "Alex", "Moshe", "Gilad", "Lia", "Maya", "Hilik", "Telnoy", "Elad", "Eliad", "Nimrod",
				"Ofir", "Ofek", "Yoni", "Sarah", "Sitara","Osnat","Slava","Lioz","Yosef","Yair","Hanna"};
		// create a matrix of names
		String[][] school = new String[3][5];
		
		// populate with random names 
		for (int i = 0; i < school.length; i++) {
			for (int j = 0; j < school[i].length; j++) {
				school[i][j] = names[(int) (Math.random() * names.length)];
			}
		}
		for (int i = 0; i < school.length; i++) {
			System.out.println("Class " + (i+1));
			System.out.println(Arrays.toString(school[i]));
		}
	}

}
