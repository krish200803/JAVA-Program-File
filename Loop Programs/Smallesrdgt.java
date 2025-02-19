class SmallestDgt
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
