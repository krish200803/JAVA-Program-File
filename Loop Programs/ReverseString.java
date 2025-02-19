class ReverseString 
{
	public static void main(String[] args) 
	{
		String str = "RAMESH";
		String  rev = "";
		for(int i = 0; i<str.length();i++)
		{
			rev = str.charAt(i)+rev;
		}
		System.out.println("The Original String is "+str);
		System.out.println("The Reverse String is "+rev);
	}
}
