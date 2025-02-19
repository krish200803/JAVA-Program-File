import java.util.Scanner;
class Celcius 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in Celcius : ");
		double Cel = sc.nextDouble();
		int a = 32;
		//final int f = (9/5);
		double Far = (9.0/5 * Cel) + a;

		System.out.println( Cel+ " Celcius is "+ Far +" Farhenheit");
	}
}
