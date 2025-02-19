import java.util.Scanner;
class AreaofRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float height = 7.9f;
		float width = 4.5f;
		float A = height * width;
		float Peri = 2 * height * width;

		System.out.println("Area of Rectangle "+ A +"cm^2");
		System.out.println("Perimeter of Rectangle "+ Peri +"cm");
	}
}
