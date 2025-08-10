package STRINGS;

public class Extract_SubString_Between_StartIndex_and_EndIndex {

	public static void main(String[] args) {
		
		String s = "I Love India";
		
		System.out.println(subString(s, 7, 12));   //   India

	}
	
	public static String subString(String s, int start, int end)
	{
		if(start < end)                 //  Always Start should be Less than End
		{
			String subString = "";
			
			for(int i=start; i<end; i++)
			{
					subString += s.charAt(i);
			}
			return subString;
		}
		return s;
		
	}

}
