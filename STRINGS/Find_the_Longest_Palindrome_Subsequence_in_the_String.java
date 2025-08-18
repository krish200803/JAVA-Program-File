package STRINGS;

public class Find_the_Longest_Palindrome_Subsequence_in_the_String {

	public static void main(String[] args) {

		String s = "forgeeksskeegfor";     
		
//		String p = addSpaces(s);
//		
//		System.out.println(p);
//		
//		System.out.println(removeSpaces(s, ' '));
//		
//		System.out.println(subString(s, 5, 9));
		
		System.out.println(longPalindromeSubSq(s));     // geeksskeeg

	}
	
	public static String longPalindromeSubSq(String s)
	{
		s = addSpaces(s);
		
		int max=0,i=0,j=0,k=0;
		String longestPal = "";
		
		while(i<s.length())
		{
			if(j>0 && k<s.length()-1)
			{
				if(s.charAt(j-1) == s.charAt(k+1))
				{
					j--;
					k++;
				}
				else if(k-j>0)
				{
					String temp = s.substring(j, k+1);
					temp = removeSpaces(temp, ' ');
//					System.out.println(temp);
					
					if(temp.length() > max && temp.length() > 1)
					{
						max = temp.length();
						longestPal = temp;
					}
					i++;
					j=k=i;
				}
				else
				{
					i++;
					j=k=i;
				}
			}
			else
			{
				if(k-j>0)
				{
					String temp = s.substring(j,k+1);
					temp = removeSpaces(temp, ' ');
//					System.out.println(temp);
					
					if(temp.length() > max && temp.length() > 1)
					{
						max = temp.length();
						longestPal = temp;
					}
				}
				i++;
				j=k=i;
			}
		}
		return longestPal;
	}
	
	public static String addSpaces(String s)
	{
		String ans = "";
		for(int i=0; i<s.length(); i++)
		{
			ans += s.charAt(i)+" ";
		}
		return ans.trim();
	}
	
	public static String removeSpaces(String s, char ch)
	{
		String ans  = "";
		for(int i=0 ;i<s.length(); i++)
		{
			if(s.charAt(i) != ch)
			{
				ans += s.charAt(i);
			}
		}
		return ans;
	}
	
	public static String subString(String s, int start, int end)
	{
		if(start < end)
		{
			String ans = "";
			for(int i=start ;i<end; i++)
			{
				ans += s.charAt(i);
			}
			return ans;
		}
		return s;
	}

}
