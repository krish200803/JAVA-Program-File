import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = sc.next().charAt(0);

		String vowel= (ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')?(ch+ " Is a Vowel"):(ch+" Is a Consonent");
		System.out.println(vowel);
	}
}
