import java.util.Scanner
class Character1 
{
	public static void main(String[] args) 
	{
		/*char ch = 'a';
		System.out.println((ch >= 'A' && ch <= 'Z')?(ch+" Is a Upper Case Character"):(ch+" Is Not a UpperCase Character"));*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character :")
		char ch = sc.next().charAt(0);

		String char = ((ch>='A' && ch<='Z') || (ch>= 'a' && ch<='z'))?((ch>='a' && ch<='z')?(ch+" is an LowerCase Character"):(ch+" is an UpperCase Character")):((ch>='0' && ch<='0')?(ch+" is a Digit"):(ch+" is a Special character"));
	}
}