package STRINGS;

public class Return_the_Length_of_String_without_using_any_Buildins {

	public static void main(String[] args) {
		
		String s = "I Love India";
		
		System.out.println(length(s));

	}
	
	public static int length(String s)
	{
		int count = 0;
		
		for(int i=0; ;i++)
		{
			try
			{
				s.charAt(i);
				count++;
			}
			catch(StringIndexOutOfBoundsException ref)
			{
				return count;
			}
		}
	}

}
