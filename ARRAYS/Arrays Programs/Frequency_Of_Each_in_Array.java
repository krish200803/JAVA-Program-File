
//	Write a Program to count the Frequency of Every Element present in an Array

// Execution Flow                     [ Very.Very IMP Problem ] 

//	To find the Frequency we will take 1 element from an Array eg. a[1] = 10 and it will compare with all the remaing 
//	element from the Array one by one and the comparision will always start from a[i+1] i.e from index + 1 from an 
//	element which we want to compare.
//	and also we will create the count[] array same as size of the a[] array to store the count .
//	and also there is a ct variable which will keep the count of element repeated.
//
//	if we find the element same as that of comparing element then the count[i] array index will be -1 store to the 
//	repeating element place and the ct will increase by 1.
//	and at the end ct value will asign to count[i] eg count[0] i.e a[0] = 10.

//           OUTPUT
//	[10, 20, 30, 2, 40, 6, 2, 10, 30]
//	10 is Repeated 1 times
//	20 is Repeated 0 times
//	30 is Repeated 1 times
//	2 is Repeated 1 times
//	40 is Repeated 0 times
//	6 is Repeated 0 times

package ARRAYS.Programs;

import java.util.Arrays;

public class Frequency_Of_Each_in_Array {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,2,40,6,2,10,30};
		
		int freq[] = frequencyOfEle(a);
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<freq.length; i++)
		{
			if(freq[i] != -1)
			{
				System.out.println(a[i]+ " is Repeated "+ freq[i]+ " times");
			}
		}
		
		System.out.println(Arrays.toString(frequencyOfEle(a)));

	}
	
	public static int[] frequencyOfEle(int a[])  
	{
		int count[] = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			int ct = 0;
			
			if(count[i] != -1)
			{
				for(int j = i+1; j<a.length; j++)
				{
					if(a[i] == a[j])
					{
						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;
	}
	
}
