import java.util.Scanner;
class NumtoWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String ch ="";
		for(int i=num; i>1; i/=10)
		{
			int rem = num %10;              // 123 => 3(rem)
			switch(rem)
			{
				case 1:
					ch = "One"+ch;
					break;

				case 2:
					ch = "Two"+ch;
					break;
				
				case 3:
					ch = "Three"+ch;
					break;

				case 4:
					ch = "Four"+ch;
					break;
					
				case 5:
					ch = "Five"+ch;
					break;

				case 1:
					ch = "One"+ch;
					break;

				case 1:
					ch = "One"+ch;
					break;
				

			}
		}

	}
}
