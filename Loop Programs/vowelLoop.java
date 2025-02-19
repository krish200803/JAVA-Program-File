import java.util.Scanner;
class vowelLoop
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String str = sc.next().toUpperCase();
		System.out.println(str);
		int len = str.length();
		//System.out.println(len);

		for(char i=0 ; i<len ; i++)
		{
			char ch = str.charAt(i);
			//System.out.print(ch);
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				System.out.println(ch+" is a Vowel ");
			}
			else
			{
				System.out.println(ch+" is a Consonent");
			}
		}
	}
}
