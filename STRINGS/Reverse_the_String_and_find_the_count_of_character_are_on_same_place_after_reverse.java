package STRINGS;

public class Reverse_the_String_and_find_the_count_of_character_are_on_same_place_after_reverse {

	public static void main(String[] args) {
		
//		String s = "abcba";             // 5
		
		String s = "adidxxhpla";        // 4
		
		System.out.println(countReverseSameCharacter(s));    

	}
	
	public static int countReverseSameCharacter(String s)
	{
		int ct = 0;
		
		for(int i=0, j=s.length()-1; i<=j;i++,j--)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				ct+=2;
			}
		}
		return s.length()%2 == 0 ? ct : ct-1;
	}

}
