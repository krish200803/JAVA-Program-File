class ForLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("1 to 10");
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("A to Z");
		for(char i = 'A'; i<='Z'; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Z to A");
		for(char i = 'Z'; i>='A'; i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("0 to 9");
		for(char i = '0'; i<='9'; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();

		System.out.println("ASCII");
		for(int i = 0; i<=127 ;i++)
		{
			System.out.println(i+":"+((char)i)+" ");
		}
	}
}
