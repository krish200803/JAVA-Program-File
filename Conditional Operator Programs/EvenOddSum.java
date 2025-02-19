class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int EvenSum = 0;
		int OddSum = 0;
		int rem = 0;

		rem = num % 10;       // 4 (rem)
		int temp = (rem % 2 == 0)?(EvenSum = EvenSum + rem):(OddSum = OddSum + rem);     // 4 % 2 == 0 => TRUE     EvenSum = 0 + 4 => 4

		num = num / 10;       // 123 (New Number)
		rem = num % 10;       // 3 (rem)
		temp = (rem % 2 == 0)?(EvenSum = EvenSum + rem):(OddSum = OddSum + rem);         // 3 % 2 == 0 => False    OddSum = 0 + 3 => 3

		num = num / 10;       // 12 (New Number)
		rem = num % 10;       // 2 (rem)
		temp = (rem % 2 == 0)?(EvenSum = EvenSum + rem):(OddSum = OddSum + rem);         // 2 % 2 == 0 => True     EvenSum = 4 + 2 => 6

		num = num / 10;       // 1 (New Number)
		rem = num % 10;       // 1 (rem)
		temp = (rem % 2 == 0)?(EvenSum = EvenSum + rem):(OddSum = OddSum + rem);         // 1 % 2 == 0 => False    OddSum = 3 + 1 => 4


		System.out.println("The Even Number sum is :"+ EvenSum);   // 6
		System.out.println("The Odd Number sum is :"+ OddSum);     // 4
	}
}
