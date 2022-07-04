package b.breakAndContinue;

import java.util.Scanner;

public class TargilContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		sc.close();
		if(one > two) {
			int tmp = one;
			one = two;
			two = tmp;
		}
		outer:for(int i = one; i <= two; i++) {
			if(i % 7 == 0) {
				System.out.println("boom");
				continue;
			}else {
				int n = i;
				while(n != 0) {
					if(n%10==7) {
						System.out.println("boom");
						continue outer;
					}else {
						n = (int)n/10;
					}
				}System.out.println(i);
			}
			
		}
	}
}
