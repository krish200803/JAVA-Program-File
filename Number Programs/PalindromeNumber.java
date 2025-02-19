import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String num = sc.next();
		String rev = "" ;
		for(int i = 0; i<num.length(); i++)
		{
			 rev = num.charAt(i) + rev ;
		}
		if(rev.equals(num))
		{
			System.out.println(num+" is A Palindrome Number");
		}
		else
		{
			System.out.println(num+" is Not a Palindrome Number");
		}
	}
}
