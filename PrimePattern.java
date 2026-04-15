class PrimePattern 
{
	public static void main(String[] args) 
	{
		//System.out.println(nextPrime(2));
		pattern(4);
	}
	
	public static void pattern(int n)
	{
		int start = 2;
		for (int i = 0; i < n ;i++ )
		{
			for (int j = 0; j<=i ;j++ )
			{
				if (isPrime(start))
				{
					//start = nextPrime(start);
					System.out.print(start + " ");
				}
				else
				{					
					start = nextPrime(start);
					System.out.print(start + " ");
				}
				
				start++;
			}
			System.out.println();
			
		}
	}
	
	public static boolean isPrime(int num)
	{
			int den = 1;
			
			while (den*den <= num)
			{
				if (num % den == 0)
				{
					return false;
				}
				den++;
			}
			
			return den*den > num;
		
	}
	
	public static int nextPrime(int num)
	{
		while (true)
		{
			int den = 2;
			
			while (den*den <= num)
			{
				if (num % den == 0)
				{
					break;
				}
				den++;
			}
			
			if (den*den > num)
			{
				return num;
			}
			
			num++;
		}
	}
	
	
	
}
