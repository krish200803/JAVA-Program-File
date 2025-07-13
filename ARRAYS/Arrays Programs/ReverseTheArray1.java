
//	Write a program to reverse the given Array without Extra Variable  

package ARRAYS.Programs;
                                                         
import java.util.Arrays;                                //   [ LOGIC 3 ]

public class ReverseTheArray1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(reverseArray(a)));

	}
	
//	We had Done Swapping Without Extra Variable
	
	public static int[] reverseArray(int a[])
	{
		for(int i = 0, j = a.length-1; i<j; i++,j--)
		{
			a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
		}
		return a;
	}

}
