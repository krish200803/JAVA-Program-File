class EvenOddPro 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int evenpro = 1;
		int oddpro = 1;
		int rem = 0;
		int temp = 0;
		
		rem = num % 10;
		temp = (num % 2 == 0)?(evenpro = evenpro * rem):(oddpro = oddpro * rem);

		num = num / 10;
		rem = num % 10;
		temp = (num % 2 == 0)?(evenpro = evenpro * rem):(oddpro = oddpro * rem);
		
		num = num / 10;
		rem = num % 10;
		temp = (num % 2 == 0)?(evenpro = evenpro * rem):(oddpro = oddpro * rem);

		num = num / 10;
		rem = num % 10;
		temp = (num % 2 == 0)?(evenpro = evenpro * rem):(oddpro = oddpro * rem);




		System.out.println("Product of Even Numbers is :"+ evenpro);
		System.out.println("Product of Odd Numbers is :"+ oddpro);

	}
}
