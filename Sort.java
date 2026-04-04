class Sort 
{
	public static void main(String[] args) 
	{
		System.out.println(sort(4524));
	}
	
	public static int sort(int num)
	{
		int ans = 0;
		
		for (int i = 1; i <= 9 ;i++ )
		{
			int temp = num;
			
			while (temp != 0)
			{
				
				if (temp%10 == i)
				{
					ans = ans*10+(temp%10);
				}
				temp /= 10;
			}
		}
		
		return ans;
	}
}
