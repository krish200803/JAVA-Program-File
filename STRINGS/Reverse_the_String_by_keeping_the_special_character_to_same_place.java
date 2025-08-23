package STRINGS;

public class Reverse_the_String_by_keeping_the_special_character_to_same_place {
	
	public static void main(String[] args) {
		
//		String s = "Ni@Le_sh$ ";
		
		String s = "Ni@Lh}e_sh$";
		
		System.out.println(s);              //  Ni@Lh}e_sh$      
		System.out.println(reverse(s));     //  hs@eh}L_iN$ 
		System.out.println(reverse1(s));   //   hs@eh}L_iN$
	}
	
	public static String reverse(String s)
	{	
		char[] ch = s.toCharArray();
		int i=0, j=ch.length-1;
		while(i<j)
		{
			if(ch[i] >= 32 && ch[i] <= 64 || ch[i] >=91 && ch[i] <= 96 || ch[i] >=123 && ch[i] <= 128 )
			{
				i++;
			}
			if(ch[j] >= 32 && ch[j] <= 64 || ch[j] >=91 && ch[j] <= 96 || ch[j] >=123 && ch[j] <= 128 )
			{
				j--;
			}
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					i++;
					j--;
		}
		return new String(ch);
	}
	
	public static String reverse1(String s)     // Using in build Method
	{	
		char[] ch = s.toCharArray();
		
		int i=0, j=ch.length-1;
		
		while(i<j)
		{	
            if (!Character.isLetter(ch[i])) {
                i++;
                continue;
            }
            if (!Character.isLetter(ch[j])) {
                j--;
                continue;
            }

			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}


}
