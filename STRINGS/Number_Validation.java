package STRINGS;

public class Number_Validation {

	public static void main(String[] args) {
		
		String s = "876713j593";
		
//		System.out.println(s.length());
		
		System.out.println(validate_Number(s));

	}
	
	public static boolean validate_Number(String s)
	{
		if(s.length() == 10)
		{
			if (s.charAt(0) == '6' || s.charAt(0) == '7' || s.charAt(0) == '8' || s.charAt(0) == '9') 
			{
				for (int i = 0; i < s.length(); i++) 
				{
					char ch = s.charAt(i);
					System.out.println(ch);
					if (ch < '0' || ch > '9') 
					{
						return false;
					}
				} 
				return true;
			}
		}
		return false;
	}

}
