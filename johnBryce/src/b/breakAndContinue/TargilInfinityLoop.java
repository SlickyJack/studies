package b.breakAndContinue;

public class TargilInfinityLoop {

	public static void main(String[] args) {
		for(;;) {   // infinity loop (while(true) can be used also)
		int num = (int)(Math.random()*101);
			System.out.println(num);
			if (num%2==0) {
				break;
			}
		}
		System.out.println("END");
	}

}
