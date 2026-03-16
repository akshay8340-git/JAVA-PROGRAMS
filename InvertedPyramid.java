class InvertedPyramid 
{
	public static void main(String[] args) 
	{
		int n = 5, space = 0, star = n*2 - 1;
			
		for (int i = 0; i < n ;i++ )
		{
			for (int j = 0;j < space ;j++ )
			{
				System.out.print("  ");
			}
			
			for (int j = 0; j < star ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			
			if (i < n)
			{
				space++;
				star -= 2;
			}
		}
		
	}
}
