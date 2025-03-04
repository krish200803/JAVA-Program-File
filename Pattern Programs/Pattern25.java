class Pattern25                                            // programing batch
{
	public static void main(String[] args) 
	{
		int a = 2;
		for(int i=1; i<=5; i++)
		{ 
			for(int j=1; j<=i; j++)
			{
					System.out.print(a +" ");
					a +=2;
			}
			System.out.println();
		}
	}
}
