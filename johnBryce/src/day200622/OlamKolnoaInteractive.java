package day200622;

import java.util.Arrays;
import java.util.Scanner;

public class OlamKolnoaInteractive {
	// field
	// create two dimension array
	static char[][] kolnoa = new char[5][10];

	static Scanner sc = new Scanner(System.in);

	// main - application bootstrap
	public static void main(String[] args) {
		showMenu();
		String input = sc.nextLine();
		init();
		lbl: while(true) {
		switch (input) {
		case "p":
			System.out.println("print");
			print();
			break;
		case "a":
			System.out.println("admit");
			System.out.println("enter row number: ");
			int row = sc.nextInt();
			System.out.println("enter seat number: ");
			int seat = sc.nextInt();
			admit(row, seat);
			break;
		case "x":
			System.out.println("exit");
			sc.close();
			break lbl;
		default:
			System.out.println(input + " is not a supported option");
			break;
		}
		}
	}

	// method definitions
	static void showMenu() {
		System.out.println("Yes Planet Menu =============");
		System.out.println("p.......................print");
		System.out.println("a.......................admit");
		System.out.println("x........................exit");
		System.out.println("Enter your choice: ");
	}

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
		for (int i = 0; i < kolnoa.length; i++) {
			System.out.println(Arrays.toString(kolnoa[i]));
		}
		System.out.println("==============================");
	}

	// method admits person to specific chair
	static void admit(int row, int seat) {
		row--;
		seat--;
		if (kolnoa[row][seat] == '0') {
			kolnoa[row][seat] = 'X';
		} else {
			System.out.println("seat is taken");
		}
	}

}
