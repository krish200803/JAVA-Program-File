class SumofNum 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int dup = num;
		int sum = 0;
		int rem = 0;
		
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		System.out.println("Original no is :"+ dup);
		System.out.println("Sum of no. is :"+sum);
	}
}
