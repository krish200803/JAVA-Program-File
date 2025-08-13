package STRINGS;

import java.util.Arrays;

public class Create_Method_to_Split_String_by_Character {      // Same as "Split Method" of String Class

	public static void main(String[] args) {
		
		String s = "I Love Bharat";
		
		System.out.println(Arrays.toString(split(s, 'a')));

	}
	
	public static String[] split(String s, char ch)
	{
		int ct = 0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ch)
			{
				ct++;
			}
		}
		
		String [] ans = new String[ct+1];
		
		String temp = "";
		
		for(int i=0,j=0; i<s.length(); i++)
		{
			char ref = s.charAt(i);
			
			if(ch != ref)
			{
				temp += ref;
			}
			else
			{
				ans[j] = temp;
				j++;
				temp ="";
			}
		}
		ans[ans.length-1] = temp;
		return ans;
	}

}
