package STRINGS;

public class Check_SubString_is_Present_in_String {       // Same as Contains() Method of String Class

	public static void main(String[] args) {
		
//		String s = " aeroplaplanplane";
//		
//		String s1 = "plane";
		
		String s = "ssspss";
		
		String s1 = "sspss";
		
		System.out.println(contains_Method(s, s1));

	}
	
	public static boolean contains_Method(String s, String s1)
	{
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) == s1.charAt(0))
			{
				int j=0, k=i;
				
				for( ; j<s1.length();)
				{
					if(s.charAt(k) == s1.charAt(j))
					{
						j++;
						k++;
					}
					else
					{
						break;
					}
				}
				
				if( j == s1.length())
				{
					System.out.println(j);
					return true;
				}
			}
		}
		return false;
	}

}
