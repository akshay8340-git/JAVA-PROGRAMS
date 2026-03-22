class HollowDiamond 
{
	public static void main(String[] args) 
	{
		
		int n = 9;
		int left = n/2, right = n/2;
		
		for (int i = 0; i < n ; i++ )
		{
			for (int j = 0; j < n5 ; j++ )
			{
				if (j < left || j > right)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println();
			
			if (i < n/2)
			{
				left--;
				right++;
			}
			else
			{
				left++;
				right--;
			}
			
		}
		
	}
}
