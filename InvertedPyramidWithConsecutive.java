class InvertedPyramidWithConsecutive 
{
	public static void main(String[] args) 
	{
		int n = 7, sp = n-1, star = 1;
		
		for (int i = 0;i < n ;i++ )
		{
			for (int j = 0; j < sp ;j++ )
			{
				System.out.print("  ");
			}
			
			for (int j = 0;j < star ; j++ )
			{
				System.out.print("*   ");
			}
			
			System.out.println();
			
			if (i < n)
			{
				sp--;
				star++;
			}
		}
		System.out.println("Hello World!");
	}
}
