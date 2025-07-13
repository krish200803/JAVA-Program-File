
//	Write a Program to Find the Maximun Element in the Array

package ARRAYS.Programs;

public class FindMaxElement {

	public static void main(String[] args) {
		
		int a[] = {10,32,43,23,12,8,49};
		
		int max = MaxNum(a);
		
		System.out.println(max);
		

	}
	
	public static int MaxNum(int a[])
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}

}
