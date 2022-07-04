package b.breakAndContinue;

public class Demo1Break {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==7) {
				break;
			}
		}
	}

}
