package STRINGS;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		System.out.println(s.length());    //  11
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);      //   dlroW olleH

	}

}
