class Descending 
{
	public static void main(String[] args) 
	{
		System.out.println(desc(90405));
	}
	
	public static int desc(int num)
	{
		int ans = 0;
		
		for (int i = 9;i >= 0;i-- )
		{
			int temp = num;
			
			while (temp != 0)
			{
				if (temp%10 == i)
				{
					ans = ans*10 + i;
				}
				temp /= 10;
			}
		}
		
		return ans;
	}
}
