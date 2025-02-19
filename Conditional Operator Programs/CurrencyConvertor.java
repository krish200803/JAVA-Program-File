import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("      Currency Convertor      ");
		System.out.println();
		System.out.println("Enter the Currency Amount(INR) :");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("List of Currency");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. DHM");
		System.out.println();
		System.out.print("Enter the Currency: ");
		String curr = sc.next().toUpperCase();

		float conCurr = 0;
		if(curr.equals("USD"))
		{
			conCurr = inr/86.56f;
			System.out.println(inr+" INR "+ conCurr+" USD");
		}
		else if(curr.equals("EUR"))
		{
			conCurr = inr/90.25f;
			System.out.println(inr+" INR "+ conCurr+" EUR");
		}
		else if(curr.equals("GBP"))
		{
			conCurr = inr/107.66f;
			System.out.println(inr+" INR "+ conCurr+" GBP");
		}
		else if(curr.equals("PKR"))
		{
			conCurr = inr/0.31f;
			System.out.println(inr+" INR "+ conCurr+" PKR");
		}
		else if(curr.equals("DHM"))
		{
			conCurr = inr/23.57f;
			System.out.println(inr+" INR "+ conCurr+" DHM");
		}
		else{
			System.out.println("INVALID OPTION");
		}
	}
}
