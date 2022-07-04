package b.breakAndContinue;

public class TargilSumOfPrevious {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			int x =(int)(Math.random()*101);
			System.out.println(x);
			if(sum == x) {
				System.out.println("X = "+x+ " Sum of all previous is "+ sum);
				System.out.println("END");
				break;
			}
			sum +=x;
		}
	}

}
