class DiamondPatternConsecutiveStars 
{
	public static void main(String[] args) 
	{
		int n = 17 , space = n/2, star = 1;
		
		for (int i = 0; i < n ; i++ )
		{
			for (int j = 0; j < space ; j++ )
			{
				System.out.print("  ");
			}
			
			for (int k = 0; k < star ;k++ )
			{
				System.out.print("*   "); // three spaces first for normal 2nd where first the star used to print and 3rd space after that first star
			}
			
			System.out.println();
			
			if (i < n/2)
			{
				space--;
				star++; // and only 1 star increase at each row
			}
			else
			{
				space++;
				star--; // only 1 star decrease at each row
			}
		}
	
	}
}
