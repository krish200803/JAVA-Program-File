package STRINGS;

public class Check_if_Character_is_Present_in_Given_String {

	public static void main(String[] args) {
		
		String s = "I Love India";
		
//		is_Present(s, 'L');
		
		System.out.println(is_Present(s, 'L'));
		

	}
	
	public static boolean is_Present(String s, char ch)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == ch)
			{
				return true;
			}
		}
		return false;
	}

}
