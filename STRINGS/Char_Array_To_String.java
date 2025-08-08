package STRINGS;

import java.util.Arrays;

public class Char_Array_To_String {

	public static void main(String[] args) {
		
		char[] ch = {'U','m','e','s','h'};
		
		String s = new String(ch);
		
		System.out.println(s);       //  Umesh
		
		System.out.println(Arrays.toString(s.getBytes()));  //  [85, 109, 101, 115, 104]

	}

}
