class Butterfly 
{
	public static void main(String[] args) 
	{
        pattern(5);
	}
	
	public static void pattern(int n)
	{
		int star = 1;
		int space = n/2;
		
		for (int i = 0; i < n ; i++ )
		{
			for (int j = 0; j < star ;j++)
			{
				System.out.print("* ");
			}
			
			for (int j = 0; j <= space ;j++ )
			{
				System.out.print("  ");
			}
			
			for (int j = 0; j < (i == n/2 ? star-1 : star) ; j++ )
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			
			if (i < n/2)
			{
				star++;
				space-=2;
			}
			else
			{
				star--;
				space+=2;
			}
		}
	}
}
