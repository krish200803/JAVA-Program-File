import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String username1 = null;
		String password1 = null;
		String address = null;
		Long contact = 0l;
		double balance = 0.0;
		for( ; ; )
		{
			System.out.println();
			System.out.println("              WELCOME            ");
			System.out.println("         LAKMI CHEAT FUND        ");
			System.out.println();
			System.out.println("1. EXISTING USER");
			System.out.println("2. CREATE ACCOUNT");
			System.out.println("Enter the Option : ");
			int opt = sc.nextInt();
			System.out.println();
			if(opt == 1)
			{
				if(username1 == null)
				{
					System.out.println("Create your Account First");
					continue;
				}

				System.out.println("     LOGIN     ");
				System.out.println();

				for(int i=3; i>=1; i--)
				{
					System.out.println();
					System.out.println("Username : ");
					String username = sc.next();
					System.out.println("Password : ");
					String password = sc.next();
					if(username.equals(username1) && password.equals(password1))
					{
						home:
						for(; ; )
						{
							System.out.println();
							System.out.println("   HOME PAGE   ");
							System.out.println();
							System.out.println("1. DEPOSIT ");
							System.out.println("2. WITHDRAW ");
							System.out.println("3. CHECK BALANCE");
							System.out.println("4. MINI STATEMENT");
							System.out.println("5. LOGOUT");
							System.out.println("Enter the Option");
							int opt1 = sc.nextInt();



			}
		}

	}
}
