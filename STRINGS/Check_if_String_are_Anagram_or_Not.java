package STRINGS;

public class Check_if_String_are_Anagram_or_Not {    // Logic 1  &&  Logic 2
 
	public static void main(String[] args) {
		
		String s1 = "Eleven plus two".toLowerCase();
		
		String s2 = "Twelve plus one".toLowerCase();
		
		System.out.println(sort_Characters(s1));        //  "  eeellnopstuvw"
		
		System.out.println(sort_Characters(s2));        //  "  eeellnopstuvw"
		
		System.out.println(is_Anagram(s1, s2));         //  True
		
		System.out.println(check_Anagram(s1, s2));      //  True

	}

//	------------------------------------------  Logic 1 --------------------------------------------
	
	public static boolean is_Anagram(String s1, String s2)
	{
		if(s1.length() == s2.length())
		{
			return sort_Characters(s1).equals(sort_Characters(s2));
		}                           // So after sort we will check if it is Equal or not
		return false;
	}
	
	// First we will sort both of the String using char[] array 
	//   s1 =   eeellnopstuvw  
	//   s2 =   eeellnopstuvw
	public static String sort_Characters(String s)   
	{
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-1-i;j++)
			{
				if(ch[j] > ch[j+1])
				{
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		return new String(ch);
	}
	
//	------------------------------------------  Logic 2 ----------------------------------------------
	
	public static boolean check_Anagram(String s1, String s2)    
	{
		if(s1.length() == s2.length())
		{
			int [] ar1 = new int[127];
			int [] ar2 = new int[127];
			
			for(int i=0; i<s1.length(); i++)
			{
				ar1[s1.charAt(i)]++;
				ar2[s2.charAt(i)]++;
			}
			
			for(int i=0;i<ar2.length;i++)
			{
				if(ar1[i] != ar2[i])
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
