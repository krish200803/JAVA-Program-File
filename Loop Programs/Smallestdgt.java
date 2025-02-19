class Smallestdgt
{
	public static void main(String[] args) 
	{
		int  num = 65348231;
		int min = 8;
		for(int i = num; i>0; i/=10)
		{
			int dgt = i%10;
			if(min>dgt)
			{
				min = dgt;
				
			}
			System.out.println(dgt+ " : " + min);
		}
		System.out.println("The Smallest number in "+ num +" is "+ min);
	}
}

/*class Largestdgt
{
	public static void main(String[] args) 
	{
		int  num = 65348231;
		int max = 0;
		for(int i = num; i>0; i/=10)
		{
			int dgt = i%10;
			if(max<dgt)
			{
				max = dgt;
				
			}
			System.out.println(dgt+ " : " + max);
		}
		System.out.println("The Largest number in "+ num +" is "+ max);
	}
}*/

