
//	Remove an Occurances of Element from Array

package ARRAYS.Programs;

import java.util.Arrays;

public class Remove_Occourences_of_Element {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,20,50,20,90,100};    // O/P ->    [10, 30, 40, 50, 90, 100]
		
		System.out.println(Arrays.toString(removeOcc(a, 20)));

	}
	
	public static int[] removeOcc(int a[], int ele )    // ele = 20
	{
		int ct = 0;
		for(int i=0; i<a.length; i++)        // This loop will find the number of time element repeated
		{
			if(a[i] == ele)
			{
				ct++;
			}
		}
		
		if(ct > 0)
		{
			int[] ans = new int[a.length - ct];
			
			for(int i = 0, j = 0; i<a.length; i++)   
			{
				if(a[i] != ele)            // This condition will remove the element
				{
					ans[j] = a[i];
					j++;
				}
			}
			return ans;
		}
		return a;
	}

}
