import java.util.Scanner;
class Percentage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks :");
		int mark = sc.nextInt();
		
		int permark = (mark*100)/600;
		System.out.println(permark+" is your percentage");

		String percent = (permark >= 75)?("Grade A"):(permark >= 60)?"Grade B":(permark >=35)?"Grade C":"FAIL";

		System.out.println(percent);
	}
}
