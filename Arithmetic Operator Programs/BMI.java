import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Weight in Pounds :");
		float weight = sc.nextFloat();
		System.out.print("Enter the Height in Inches :");
		float height = sc.nextFloat();

		float kilo = weight * 0.45359237f;
		float meter = height * 0.0254f;

		float bmi = kilo / (meter * meter);

		System.out.println("BMI is :"+bmi);
	}
}
