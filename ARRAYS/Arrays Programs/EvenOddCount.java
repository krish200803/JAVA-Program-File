
//Write a Program to Find the Count of Even Data And Odd data in an Array

package ARRAYS.Programs;

public class EvenOddCount {

	public static void evenOddCnt(int ar[])
	{
		int evenCnt = 0, oddCnt = 0;
		
		for(int i = 0;i<ar.length; i++)
		{
			if(ar[i] % 2 == 0)
				evenCnt++;
			else
				oddCnt++;
		}
		
		System.out.println("Even Number Count in Array is : "+ evenCnt);
		System.out.println("Odd Number Count in Array is : "+ oddCnt);
	}
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,4,6,23,4,856,95,0};
		
		evenOddCnt(ar);

	}

}
