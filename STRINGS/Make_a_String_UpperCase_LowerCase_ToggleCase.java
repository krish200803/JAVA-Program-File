package STRINGS;

public class Make_a_String_UpperCase_LowerCase_ToggleCase {

	public static void main(String[] args) {
		
		String s = "qs@jHmW$pyIeR#Qn";
		
		System.out.println(to_UpperCase(s));      //  QS@JHMW$PYIER#QN
		System.out.println(to_LowerCase(s));      //  qs@jhmw$pyier#qn
		System.out.println(to_ToggleCase(s));     //  QS@JhMw$PYiEr#qN
	}
	
	public static String to_UpperCase(String s)
	{
		String ans = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'a' && ch<= 'z')
			{
				ans += (char)(ch-32);  // difference of  ASCII of 'a' = 97 & 'A' = 65 So, difference is 32 
			}
			else
			{
				ans += ch;
			}
		}
		return ans;
	}
	
	public static String to_LowerCase(String s)
	{
		String ans = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch<= 'Z')
			{
				ans += (char)(ch+32);  // difference of  ASCII of 'a' = 97 & 'A' = 65 So, difference is 32 
			}
			else
			{
				ans += ch;
			}
		}
		return ans;
	}
	
	public static String to_ToggleCase(String s)
	{
		String ans = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch<= 'Z')
			{
				ans += (char)(ch+32);  // difference of  ASCII of 'a' = 97 & 'A' = 65 So, difference is 32 
			}
			else if(ch >= 'a' && ch<'z')
			{
				ans += (char)(ch-32);
			}
			else
			{
				ans += ch;
			}
		}
		return ans;
	}
	
	

}
