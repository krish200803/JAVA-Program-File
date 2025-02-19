import java.util.Scanner;
class PasswordProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		int storePin = 1234;
		int seconds = 5000;

		outerLoop:
		for(; ; )
		{
			int attempt = 3;
			do{
				System.out.print("Enter your Pin : ");
				int pin = sc.nextInt();
				if(storePin == pin)
				{
					System.out.println("PHONE UNLOCKED");
					break outerLoop;
				}
				else{
					System.out.println("WRONG PIN");
					System.out.println("ATTEMPT LEFT "+(attempt-1));
				}
				attempt--;

			}
			while(attempt>=1);

			System.out.println();
			System.out.println("PHONEIS DISABLED FOR " +(seconds/1000)+" seconds ");
			Thread.sleep(seconds);
			seconds *= 2;
			System.out.println();
		}
			
	}
}
