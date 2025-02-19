import java.util.Scanner;
class Tip 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the bill :");
		float bill = sc.nextFloat();
		System.out.println("Tip rate :");
		float tiprate = sc.nextFloat();

		float tipAmount = (tiprate*bill) / 100;
		float totalbill = bill + tipAmount;
		System.out.println("Totalbill is :"+ totalbill);
		System.out.println("Tip Amount is :"+ tipAmount);
	}
}
