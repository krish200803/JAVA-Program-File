package STRINGS;

public class Find_the_Numbers_in_the_String {

	public static void main(String[] args) {
		
		String s = "7    ab1cd 2 5  / 4*#56X2   2";      //   712545622
		
		System.out.println(is_Number(s));
		

	}
	
	public static String is_Number(String s)
	{
		String num = "";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='0' && ch <= '9')
			{
				num += ch;
			}
		}
		return num;
	}

}
