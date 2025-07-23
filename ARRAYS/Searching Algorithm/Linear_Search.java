package ARRAYS.Seraching_Algorithm;

public class Linear_Search {

	public static void main(String[] args) {
		
		int ar[] = {1,34,56,57,443,87,43,23};
		
		System.out.println(linearSearch(ar, 23));
		
		System.out.println(element_Present_or_Not(ar, 4));

	}
	
	public static int linearSearch(int ar[], int key)
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
	
	public static boolean element_Present_or_Not(int ar[], int key)
	{
		return linearSearch(ar, key) > 0;
	}

}
