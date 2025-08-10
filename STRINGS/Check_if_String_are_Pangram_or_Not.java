package STRINGS;

public class Check_if_String_are_Pangram_or_Not {

	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over the lazy dog";
		
		System.out.println(check_Pangram(s));

	}
	
	public static boolean check_Pangram(String s)
	{
		int [] ct = new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				ct[ch-97]++;
			}
			
			if(ch>='A' && ch<='Z')
			{
				ct[ch-65]++;
			}
		}
		
		for(int i=0;i<ct.length;i++)
		{
			if(ct[i]==0)
			{
				return false;
			}
		}
		return true;
	}

}
