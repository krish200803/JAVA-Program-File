class Swapping 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 2;

		System.out.println("Before Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		//int temp = a;
		//a = b;
		//b = temp;

		 a =  a + b;
		 b = a - b;
		 a = a - b;


		System.out.println("after Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
