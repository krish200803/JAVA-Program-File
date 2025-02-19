import java.util.Scanner;
class Character2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		String num1 = ((num %2 == 0 && num % 5 == 0)?("HiiTwoFive"):((num%2 == 0)?("HiTwo"):((num %5 == 0)?("HiiFive"):("Blank"))));

		System.out.println(num1);
	}
}
