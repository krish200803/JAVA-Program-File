

// Split by char 'A' =>  "I Love Bharat"  => [I Love Bh, r, t] =>  [hB evoL I, r, t]

package STRINGS;

import java.util.Arrays;

public class Program_to_Reverse_A_word_in_an_Array_in_Split_Method {

	public static void main(String[] args) {
		
		String s = " I Love Bharat  ";
		
		System.out.println(Arrays.toString(split(s, ' ')));

	}
	
	public static String[] split(String s, char ch)
	{
		int ct = 0;
		
		String p = s.trim();        //  to trim the first and last Spaces
		
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i) == ch)
			{
				ct++;
			}
		}
		
		String [] ans = new String[ct+1];
		
		String temp = "";
		
		for(int i=0,j=0; i<p.length(); i++)
		{
			char ref = p.charAt(i);
			
			if(ch != ref)
			{
				temp += ref;
			}
			else
			{
				ans[j] = reverse_Split(temp);
				j++;
				temp ="";
			}
		}
		ans[ans.length-1] = reverse_Split(temp);
		return ans;
	}
	
	public static String reverse_Split(String temp)
	{
		char[] rev = temp.toCharArray();
		
		int i=0, j=rev.length-1;
		while(i<j)
		{
			char temp1 = rev[i];
			rev[i] = rev[j];
			rev[j] = temp1;
			i++;
			j--;
		}
		return new String(rev);
	}
	
//	public static String trim_Method(String s)
//	{
//		char[] trim = s.toCharArray();
//		
//		String store = "";
//		
//		for(int i=0; i<trim.length; )
//		{
//			if(trim[i] == ' ')
//			{
//				i++;
//			}
//			else 
//			{
//				store += trim[i];
//				i++;
//			}
//		}
//	}

}
