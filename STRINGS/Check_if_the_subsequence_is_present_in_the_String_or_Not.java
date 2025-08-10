
// 	Subsequence means that s1 = ahbdge and s2 = abc   
//	So for this we get that the abc is subsequence of s1;
//	but if s2 = bac then the result is false i.e s2 is present in the string but it is not in sequence

package STRINGS;

public class Check_if_the_subsequence_is_present_in_the_String_or_Not {

	public static void main(String[] args) {
		
		String s1 = "abc";
		
		String s2 = "ahbdgc";
		
		System.out.println(is_SubSequence(s1, s2));

	}
	
	public static boolean is_SubSequence(String s1, String s2)
	{
		int i=0;
		int j=0;
		
		while(i<s1.length() && j< s2.length())
		{
			if(s1.charAt(i) == s2.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}

		
		if(i == s1.length())
		{
			return true;
		}
		return false;
	}

}
