import java.util.Scanner;
class YearsDays 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the Minutes :");
		//long min = sc.nextLong();
		long min = 10000000l;
		long minYears = (365*24*60);
		long Year = min / minYears ; 
		long Days = (min % minYears) / (24 * 60);

		System.out.println(min+" minutes is approximately "+Year+" Years and "+Days+" Days");
	}
}
