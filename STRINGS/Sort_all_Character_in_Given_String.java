package STRINGS;

public class Sort_all_Character_in_Given_String {

	public static void main(String[] args) {
		
		String s = " njnVrfof*-*vS -fdfv@fv$*fv%*#kjAn  epovndb erJjg";  
		// "     #$%****--@AJSVbddeeffffffgjjjknnnnooprrvvvvv"
		
		String s1 = "Apple";     //  Aelpp   According to the Ascii Value
		
		System.out.println(s.length());
		
		System.out.println(to_Sort(s));

	}
	
	public static char[] to_Sort(String s)   //   BUBBLE SORT used
	{
		char [] ch = s.toCharArray();
		
		for(int i=0; i<ch.length;i++) 
		{
			for(int j=0; j<ch.length-1-i; j++) 
			{
				if(ch[j] > ch[j+1])
				{
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		System.out.println(ch.length);
		return ch;
	}

}
