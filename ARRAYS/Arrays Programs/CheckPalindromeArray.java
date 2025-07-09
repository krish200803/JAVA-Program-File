
//Check if an Array is an Palindrome or not, without Creating duplicate Array [ 2 POINTER APPROCH ]

package ARRAYS.Programs;

public class CheckPalindromeArray {
	
//	public static boolean palindrome(int ar[])        // Using boolean return type
//	{
//		int i=0, j = ar.length-1;
//		
//		while(i<j)
//		{
//			if(ar[i] == ar[j])
//			{
//				i++;
//				j--;
//			}
//			else {
//				break;
//			}
//		}
//		
//		return i>=j;
//	}
	
	public static void palindrome(int ar[]) 
	{
		int i = 0, j= ar.length-1;
		
		while(i<j)
		{
			if(ar[i] == ar[j])
			{
				i++;
				j--;
			}
			else {
				break;
			}
		}
		if(i>=j)
		{
			System.out.println("Array is Palindrome");
		}
		else {
			System.out.println("Array is not Palindrome");
		}
	}
	
	

	public static void main(String[] args) {
		
		int ar[] = {10,20,40,20,10}; 
		
//		System.out.println(palindrome(ar));
		
		palindrome(ar);

	}

}
