
//	Write a program that will keep the occurances of Element and remove the remaining Element of Array

package ARRAYS.Programs;

import java.util.Arrays;

public class Keep_Occurance_Remove_Other_Element {

	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,20,50,20,90,100};    // O/P ->    [20, 20, 20]
		
		System.out.println(Arrays.toString(keepOcc(a, 20)));

	}
	
	public static int[] keepOcc(int a[], int ele )    // ele = 20
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
			int[] ans = new int[ct];
			
			for(int i = 0, j = 0; i<a.length; i++)   
			{
				if(a[i] == ele)         // This condition will keep the element and remove the Other Element
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
