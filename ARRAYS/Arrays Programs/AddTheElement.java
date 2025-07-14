
//	Write a Program to add an Element in the Array by inputing the Index and Element

package ARRAYS.Programs;

import java.util.Arrays;

public class AddTheElement {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(addElement(a, 22, 4)));
		

	}
	
	
	public static int[] addElement(int a[], int ele, int index)
	{
		int ans[] = new int[a.length + 1];
		if(index >= 0 && index < a.length)
		{
			
			for(int i = 0; i< ans.length; i++)
			{
				if(i < index)
				{
					ans[i] = a[i];
				}
				else if(index == i)
				{
					ans[i] = ele;
				}
				else if(i > index)
				{
					ans[i] = a[i-1];
				}
			}
			return ans;
		}
		return a;
	}

}
