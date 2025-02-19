class FacinatingNumber
{
	public static void main(String[] args) 
	{
		int num = 327;
		String str = num+""+(num*2)+(num*3);
		boolean flag = true;
		//loop which Starts from 1 to 9 characters
		for(char i='1'; i<='9'; i++)
		{
			int cnt = 0; //int i char count is equal to zero for every new char
			// fetch char from string ont by one from 0 index
			for(int j=0; j<str.length(); j++)
			{
				char ch = str.charAt(j);
				if(ch==i)
					cnt++;
			}
			if(cnt!=1)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+" is a Facinating Number");
		}
		else
		{
			System.out.println(num+" is not a Facinating Number");
		}
	}
}
