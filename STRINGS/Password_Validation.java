package STRINGS;

public class Password_Validation {

	public static void main(String[] args) {
		
//		String s1 = "&Um0, esh/@123#4500";    //  False
		
		String s ="Um*esh@123/";       // False
		
		System.out.println(password_validate(s));

	}
	
	public static boolean password_validate(String s)
	{
		if(s.length()>8 && s.length()<20)
		{
			boolean has_UpperCase = false;
			boolean has_LowerCase = false;
			boolean has_specialChar = false;
			boolean has_Number = false;
			
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				System.out.println(ch);
				if(ch>='A' && ch<='Z')
				{
					has_UpperCase = true;
				}
				else if(ch>='a' && ch<='z')
				{
					has_LowerCase = true;
				}
				else if(ch >='0' && ch <='9')
				{
					has_Number = true;
				}
				else if( ch=='@' || ch=='#' || ch=='$' || ch=='&' || ch=='%' || ch=='+' || ch=='!' || ch=='^'|| 
						ch=='*' || ch=='-' || ch=='(' || ch=='(' )
				{
					has_specialChar = true;
				}
				else if(!( ch=='@' || ch=='#' || ch=='$' || ch=='&' || ch=='%' || ch=='+' || ch=='!' || ch=='^'|| 
						ch=='*' || ch=='-' || ch=='(' || ch=='(' ))
				{
				return false;
				}
				else if(ch ==' ')
				{
					return false;
				}
			}
			
			if(has_UpperCase && has_LowerCase && has_Number && has_specialChar)
			{
				return true;
			}
		}
		return false;
	}

}
