package arrays;

public class ArrayBasic {
////                                      targil 1
//	public static void main(String[] args) {
//		char [] Arr = {'a','b','c','a','b','d','r','c'};
//		int countA = 0;
//		int countCA = 0;
//		for(int i = 0; i < Arr.length; i++ ) {
//			if(Arr[i] == 'a') {
//				countA++;
//			}
//			if(Arr[i] == 'a' || Arr[i] == 'c') {
//				countCA++;
//			}
//		}
//		System.out.println(countA);
//		System.out.println(countCA);
//	}
////                                      targil 2
//	public static void main(String[] args) {
//		int count = 0;
//		String name = "John Bryce";
//		char[] ch = name.toCharArray();
//		
//		for(int i = 0; i<ch.length; i++) {
//			if(ch[i] == 'A'||ch[i] == 'a'||ch[i] == 'E'||ch[i] == 'e'||
//				ch[i] == 'I'||ch[i] == 'i'||ch[i] == 'O'||ch[i] == 'o' ||
//				ch[i] == 'U'||ch[i] == 'u' ) {
//				count++;
//			}
//		}
//		System.out.println("Name :"+ name + " have " + count + " values.");
//	}
////                                      targil 3
//	public static void main(String[] args) {
//		int count = 0;
//		String shir = "Sara Shara Shir Cameah";
//		char[] ch = shir.toCharArray();
//		
//		for(int i = 0; i<ch.length; i++) {
//			if(ch[i] == 'A'||ch[i] == 'a'||ch[i] == 'E'||ch[i] == 'e'||
//				ch[i] == 'I'||ch[i] == 'i'||ch[i] == 'O'||ch[i] == 'o' ||
//				ch[i] == 'U'||ch[i] == 'u' ) {
//				count++;
//			}
//		}
//		System.out.println("The line of song :"+ shir + " have " + count + " values.");
//	}
////                                      targil 4
//	public static void main(String[] args) {
//		int count1 = 0;
//		int count3 = 0;
//		int count52 = 0;
//		int [] Arr = {1,2,3,1,2,3,3,2,1,9,5,1,1,9};
//		for(int i = 0; i < Arr.length; i++) {
//			if(Arr[i] == 1) {
//				count1++;
//			}else if(Arr[i] == 3) {
//				count3++;
//			}else if(Arr[i] == 2 || Arr[i] == 5) {
//				count52++;
//			}
//		}
//		System.out.println("There is "+ count1 + " numbers One and " + count3 + " numbers Three and "+ count52 + " numbers five or two in this array");
//		
//	}
////                                      targil 5
//	public static void main(String[] args) {
//		
//		int arr[];
//		arr = new int[10];
//		
//		for(int i = 0; i < 10 ; i++) {
//			int n = (int)(Math.random()*90+10);
//			arr[i]=n;
//		}
//		for(int i = 0; i < 10 ; i++) {
//			System.out.print(arr[i]+ " ");
//		}
////                                      targil 6
//	public static void main(String[] args) {
//		int max = 0;
//		int arr[];
//		arr = new int[10];
//		
//		for(int i = 0; i < 10 ; i++) {
//			int n = (int)(Math.random()*90+10);
//			arr[i]=n;
//			System.out.print(arr[i]+ " ");
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println();
//		System.out.println("Maximum is " +max);
//	}
////                                      targil 7
//	public static void main(String[] args) {
//		int min = 100;
//		int arr[];
//		arr = new int[10];
//		
//		for(int i = 0; i < 10 ; i++) {
//			int n = (int)(Math.random()*90+10);
//			arr[i]=n;
//			System.out.print(arr[i]+ " ");
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println();
//		System.out.println("Minimum is " +min);
//	}
////                                      targil 8
//	public static void main(String[] args) {
//		int sum = 0;
//		int arr[];
//		arr = new int[10];
//		
//		for(int i = 0; i < 10 ; i++) {
//			int n = (int)(Math.random()*90+10);
//			arr[i]=n;
//			sum = sum + arr[i];
//			System.out.print(arr[i]+ " ");
//		}
//		System.out.println();
//		System.out.println("sum is " +sum);
//	}
//                                      targil 9
	public static void main(String[] args) {
		int sum = 0;
		int arr[];
		arr = new int[10];
		
		for(int i = 0; i < 10 ; i++) {
			int n = (int)(Math.random()*90+10);
			arr[i]=n;
			sum = sum + arr[i];
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("average is " +sum/arr.length);
	}

}
