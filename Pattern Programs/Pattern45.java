class Pattern45                                 //optimized triangle code
{
	public static void main(String[] args)      // Method 1 in pattern15   
	{                                           
		int n=7;                                
		int star = 1;
		int space= n/2;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<space; j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			if(i < n/2)
			{
				space--;
				star ++;
			}
			else{
				space++;
				star --;
			}
		}
	}
}
