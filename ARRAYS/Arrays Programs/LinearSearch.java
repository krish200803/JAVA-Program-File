
// Find if an element is present in an Array or not is Linear Search Program

package ARRAYS.Programs;

public class LinearSearch {
	
	public static int getElementIndex(int ar[], int key)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] == key)
			{
				System.out.println("Element is present at Index : "+ i);

				return i;
			}
		}
		return -1;
	}
	
	public static boolean findElement(int ar[], int key)
	{
		return getElementIndex(ar, key) > 0;
	}

	public static void main(String[] args) {
		
		int ar[] = {1,34,56,57,443,87,43,23};
		
		System.out.println(getElementIndex(ar, 23));
		
		System.out.println(findElement(ar, 4));

	}

}
