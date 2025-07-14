
//	Write a Program to Remove the Element from the Array ( This program will only remove one Element)

package ARRAYS.Programs;                 // By passing the INDEX that we have to Remove

import java.util.Arrays;

public class RemoveAnElement1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(removeEle(a, 4)));

	}
	
	public static int[] removeEle(int a[], int index)
	{
		if(index >= 0 && index < a.length) 
		{	
			int ans[] = new int[a.length - 1];
			
			for(int i = 0; i< a.length ; i++)
			{
				 if(i < index)
				 {
					 ans[i] = a[i];
				 }
				 else if(i > index)
				 {
					 ans[i-1] = a[i];
				 }
			}
			return ans;
		}
		return a;
	}
	

}
