import java.util.Scanner;
class Calculator
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num1: ");
		float num1 = sc.nextFloat();
		System.out.print("enter the num2: ");
		float num2 = sc.nextFloat();
		System.out.print("enter the operation to perform: ");
		char op = sc.next().charAt(0);
		float opt = 0;

		opt = op == '+' ? num1+num2:
			  op == '-' ? num1-num2:
			  op == '*' ? num1*num2:
			  op == '/' ? num1/num2:
			  op == '%' ? num1%num2:0.00001f;

		String output = num1 + " " + op + " " +num2+ " = " +opt;
		
		if(!(opt == 0.00001f))
			System.out.println(output);
	}
}


