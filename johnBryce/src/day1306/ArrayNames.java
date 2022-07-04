package day1306;

import java.util.Arrays;

public class ArrayNames {

	public static void main(String[] args) {
		{// dynamic initialization
		String [] name = new String[5];
		name[0]= "Dan";
		name[1]= "Ran";
		name[2]= "Edna";
		name[3]= "Machal";
		name[4]= "Ofir";
		System.out.println(Arrays.toString(name));
		}
		{
			String [] name = {"Dan", "Ran", "Edna", "Michal","Ofir"};
			System.out.println(Arrays.toString(name));
		}
	}

}
