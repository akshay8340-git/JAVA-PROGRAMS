class NumberPattern2 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num = 1;
		
	/*
	
  1
  2 3
  4 5 6
  7 8 9 10
	
	for (int i = 0;i < n ;i++ )
		{
			for (int j = 0; j <= i ;j++ )
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
		*/
		
		
	/*	
	
	
1
2 2
3 3 3
4 4 4 4
         for (int i = 0;i < n ;i++ )
		{
			for (int j = 0; j <= i ;j++ )
			{
				System.out.print(num+ " ");
			}
			num++;
			System.out.println();			
		}
		*/
		
	/*
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
	
	
	num = 1;
		for (int i = 0;i < n ;i++ )
		{
			
			int temp = num;
			for (int j = 0;j < n; j++ )
			{
				System.out.print(temp+ " ");
				temp += n;
			}
			System.out.println();
			num++;
		}
		
		*/
		
		num = 1;
		int firstDiff = 2*n - 1;
		int   secondDiff = 1;
		for (int i = 0;i < n ;i++ )
		{
			int temp = num;
			for (int j = 0;j < n ;j++ )
			{
				System.out.print(temp + " ");
				
				if (j % 2 == 0)
				{
					temp += firstDiff;
				}
				else
				{
					temp += secondDiff;
				}
			}
			System.out.println();
			num++;
			
			firstDiff -= 2;
			secondDiff += 2;
		}
		
	}
}
