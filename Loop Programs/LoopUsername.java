import java.util.Scanner;
class LoopUsername
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String str = sc.next().toUpperCase();
		System.out.println(str);
		int len = str.length();

		for(char i=0 ;i<len ; i++)
		{
			System.out.println(str.charAt(i));
			Thread.sleep(1000);
		}
	}
}
