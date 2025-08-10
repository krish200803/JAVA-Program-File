package STRINGS;

public class Replace_First_Occurance_of_Character {

	public static void main(String[] args) {


		String s = "baqqqdacmmrfewiujmkicdeam";
		
		System.out.println(replace_Occ(s, 'm', '@'));

	}
                                                     // m            // @
	public static String replace_Occ(String s, char replaceOf, char replaceBy)
	{
		char[] ar = s.toCharArray();    // Converting String to char[] using inBuild Method i.e toCharArray()
		
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i] == replaceOf)    // if we find the given character then immediate replace and break 
			{
				ar[i] = replaceBy;
				break;
			}
		}
		return new String(ar); // converting char[] to String using String constructor in return Statement
	}
}
