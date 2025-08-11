package STRINGS;

public class Sum_of_Numbers_present_in_the_String {

	public static void main(String[] args) {
		
		String s = "7    ab1cd 2 5  / 4*#56X2   2";
		
//		String s = "s1de2fr3jf4";
		
		System.out.println(sumOfNum(s));

	}
	
	public static int sumOfNum(String s)
	{
		int sum = 0;
		
// Whenever we any operation in char and num, originally the operation is between the char ASCII Value and the num
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch >='0' && ch <= '9')
			{
				sum = sum + (ch - 48);  // for converting char to int we substract ch by 48 i.e 0 ascii value
			}                          
		}
		return sum;
	}

}
