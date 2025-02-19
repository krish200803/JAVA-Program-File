import java.util.Scanner;
class TempConvertor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Convert to Fahrenheit");
		System.out.println("2. Convert to Kelvin");
		System.out.println("3. Convert to Rankine ");

		System.out.println("Enter the Choice : ");
		int Ch = sc.nextInt();

			switch(Ch)
			{
				case 1:
					System.out.println();
					System.out.println(" Convert to Celcius to Fahrenheit");
					System.out.println("Enter the Temprature in Celcius : ");
					double Cel = sc.nextDouble();
					double far = ( Cel * 9.0/5 ) + 32;
					System.out.println("The Temperature in Fahrenheit is :"+ far);
					break;

				case 2:
					System.out.println();
					System.out.println(" Convert to Celcius to Kelvin");
					System.out.println("Enter the Temprature in Celcius : ");
					double Cel1 = sc.nextDouble();
					double kel = Cel1 + 273.15;
					System.out.println("The Temperature in Kelvin is :"+ kel);
					break;

				case 3:
					System.out.println();
					System.out.println(" Convert to Celcius to Rankine");
					System.out.println("Enter the Temprature in Celcius : ");
					double Cel2 = sc.nextDouble();
					double rank = ( Cel2 * 9.0/5 )+ 491.67;
					System.out.println("The Temperature in Rankine is :"+ rank);
					break;
			}
		
	}
}
