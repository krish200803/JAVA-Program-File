package STRINGS;

public class Check_Palindrome_String {

	public static void main(String[] args) {
		
		String s = "abccba";
		
		int i;
		
		for(i=0; i<s.length()/2; i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-1-i))
			{
				break;
			}
		}
		
		if(i>=s.length()/2)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}

}
