class NumberAndAlphabet 
{
	public static void main(String[] args) 
	{
		int num = 1;
		char alp = 'a';
		int n = 5;
		
	/*	
	
a b c d e
1 2 3 4 5
f g h i j
6 7 8 9 10
k l m n o
11 12 13 14 15
	
	for (int i = 0;i < n ;i++ )
		{
			for (int j = 0; j < n ;j++ )
			{
				System.out.print(alp+" ");
				alp++;
			}
			System.out.println();
			for (int j = 0;j < n ;j++ )
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		*/
		
		for (int i = 0;i < n ;i++ )
		{
			for (int j = 0; j < n ; j++ )
			{
				System.out.print(alp + ""+num + " ");
				alp++;
				num++;
			}
			System.out.println();
		}
	}
}
