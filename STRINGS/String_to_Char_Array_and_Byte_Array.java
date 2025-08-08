package STRINGS;

import java.util.Arrays;

public class String_to_Char_Array_and_Byte_Array {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		System.out.println(Arrays.toString(s.toCharArray())); // Build In Char[] String Method
		
		System.out.println(Arrays.toString(convertToCharArray(s)));  //  [H, e, l, l, o,  , W, o, r, l, d]
		
		System.out.println(Arrays.toString(s.getBytes()));  // Build In Byte[] String Method
		
		System.out.println(Arrays.toString(convertToByteArray(s))); // [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100]

	}
	
	public static char[] convertToCharArray(String s)  // Convert String to Char[] Array
	{
		char[] ar = new char[s.length()];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = s.charAt(i);
		}
		return ar;
	}
	
	public static Byte[] convertToByteArray(String s)  // Convert String to Byte[] Array
	{
		Byte[] ar = new Byte[s.length()];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = (byte) s.charAt(i);
		}
		return ar;
	}

}
