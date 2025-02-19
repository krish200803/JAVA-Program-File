import java.util.*;
class  Addition
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		{
			// byte a = 10;
			// byte b = 20;
			System.out.println("Enter 1st Byte value : ");
			byte a = sc.nextByte() ;
			System.out.println("Enter 2st Byte value : ");
			byte b = sc.nextByte() ;
			int add = a + b;
			System.out.println(add);

			// short c = 200;
			// short d = 300;
			System.out.println("Enter 1st Short value : ");
			short c = sc.nextShort() ;
			System.out.println("Enter 2st Short value : ");
			short d = sc.nextShort() ;
			int add1 = c + d;
			System.out.println(add1);

			// int a1 = 234560;
			// int b1 = 123456;
			System.out.println("Enter 1st Int value : ");
			int a1 = sc.nextInt();
			System.out.println("Enter 2st Int value : ");
			int b1 = sc.nextInt();
			int add2 = a1 + b1;
			System.out.println(add2);

			// long e = 2200000000l;
			// long f = 3200000000l;
			System.out.println("Enter 1st Long value : ");
			long e = sc.nextLong();
			System.out.println("Enter 2st Long value : ");
			long f = sc.nextLong();
			long add3 = e + f;
			System.out.println(add3);

			// char g = 'z';
			// char h = 'b';
			// char g = sc.next.CharAt(1);
			// char h = sc.next.CharAt(1);
			// int add4 = g + h;
			// System.out.println(add4);

			// double i = 5.5;
			// double j = 2.2345;
			System.out.println("Enter 1st Double value : ");
			double i = sc.nextDouble();
			System.out.println("Enter 2st Double value : ");
			double j = sc.nextDouble();
			double add5 = i + j;
			System.out.println(add5);

			//float k = 5.5f;
			//float l = 2.234f;
			System.out.println("Enter 1st Float value : ");
			float k = sc.nextFloat();
			System.out.println("Enter 2st Float value : ");
			float l = sc.nextFloat();
			float add6 = k + l;
			System.out.println(add6);

			String s1 = "Umesh";
			String s2 = " Bhadane";
			String add7 = s1 + s2;
			System.out.println(add7);

			// boolean a2 = TRUE ;
			// boolean b2 = FALSE ;
			// boolean add = a2 + b2;
			// System.out.println(add); 
		}

	}


}
