package STRINGS;

public class Replace_Character_with_new_Character {

	public static void main(String[] args) {
		
		String s = "Umeshs";
		
		System.out.println(replace_Character(s, 's', 'Z'));    //  UmeZhZ

	}
	
	public static String replace_Character(String s, char old, char naya)
	{                                                   // s     // z
		String ans = "";
		
		for(int i=0; i<s.length();i++)
		{	
			if(s.charAt(i) == old)
			{
				ans += naya;
			}
			else
			{
				ans += s.charAt(i);    
			}
		}
		return ans;  // ans = UmeZhZ
	}

}
