import java.util.Scanner;
class  LargestNumConditional
{
	public static void main(String[] args) 
	{
		/*int a = 2;
		int b = 3;                                  
		int lar = (a>b)?(a):(b);                                 // Largest number among 2
		System.out.println(lar );*/                  

		/*int a = 40;
		int b = 30;
		int c = 56;
		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));         // Largest number among 3
		System.out.println(lar);*/

		int a = 3;
		int b = 5;
		int c = 22;
		int d = 12;
		int lar = (a>b)?((a>c)?((a>d)?(a):(d)):((c>d)?(c):(d))):((b>c)?((b>d)?(b):(d)):((c>d)?(c):(d)));             // Largest number among 4
		System.out.println("The largest number is :"+ lar);
	}
}
