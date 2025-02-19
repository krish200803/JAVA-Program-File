import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String  rev = "";
		for(int i = 0; i<str.length();i++)
		{
			rev = str.charAt(i)+rev;
		}
		if(rev.equals(str))
		{
			System.out.println("String is A Palindrome String");
		}
		else
		{
			System.out.println("String is Not a Palindrome String");
		}
	}
}
