package day200622;

import java.util.Arrays;
import java.util.Scanner;

public class Olamkolnoa {
	// field 
	//create two dimension array
	static char[][] kolnoa = new char[5][10];
	
	//main
	public static void main(String[] args) {
		// method invocation
		init();
		print();
		admit(1,1);
		admit(5,10);
		print();
	}
	
	// method definitions
	// method fill the array with '0'
	static void init() {
		for (int i = 0; i < kolnoa.length; i++) {
			for (int j = 0; j < kolnoa[i].length; j++) {
				kolnoa[i][j] = '0';

			}
		}
	}
	
	// method prints two dimension array
	static void print() {
		for(int i = 0; i < kolnoa.length; i++) {
			System.out.println(Arrays.toString(kolnoa[i]));
		}
		System.out.println("==============================");
	}
	
	// method admits person to specific chair
	static void admit(int row, int seat) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Insert row");
//		int row = sc.nextInt();
//		System.out.println("Insert seat");
//		int seat = sc.nextInt();
		
		row--;
		seat--;
		if(kolnoa[row][seat] == '0') {
			kolnoa[row][seat] = 'X';
		}else {
			System.out.println("seat is taken");
		}
	}

}
