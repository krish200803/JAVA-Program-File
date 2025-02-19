import java.util.Scanner;
class AreaofCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = sc.nextInt();
		float pi = (22/7);
		float a = pi * r * r;
		System.out.println("Area of Circle is " + a);
	}
}
