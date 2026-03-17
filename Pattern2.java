class pattern2 
{
	public static void main(String[] args) 
	{
		int n = 17;
		
		System.out.println();
		
		/*
		for (int i = 0; i < n ;i++ )
	 {
		 for (int j = 0; j < n ; j++ )
		 {
			 if (i == 0 || i == n-1 || j == 0 || j == n-1)
			 {
				 System.out.print("* ");
			 }
			 else
			 {
				System.out.print("  ");
			 }
		 }
		 
		 System.out.println();
	 }


         for (int i = 0; i < n ; i++ )
         {
			 for (int j = 0; j < n ; j++ )
			 {
				 if (i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || i + j == n-1)
				 {
					 System.out.print("* ");
				 }
				 else
				 {
					System.out.print("  ");
				 }
			 }
			 
			 System.out.println();
         }
		 
		 
* * * * * * * * * *
* *             * *
*   *         *   *
*     *     *     *
*       * *       *
*       * *       *
*     *     *     *
*   *         *   *
* *             * *
* * * * * * * * * *





         for (int i = 0;i < n ; i++ )
         {
			 for (int j = 0; j < n ; j++ )
			 {
				 if (i == 0 || i == n-1 || j == 0 || j == n-1 || i == j|| i+j == n-1 ||
					 i == n/2 || j == n/2)
				 {
					 System.out.print("* ");
				 }
				 else
				 {
					System.out.print("  ");
				 }
			 }
			 System.out.println();
         }
		 
* * * * * * * * *
* *     *     * *
*   *   *   *   *
*     * * *     *
* * * * * * * * *
*     * * *     *
*   *   *   *   *
* *     *     * *
* * * * * * * * *
	




        for (int i = 0; i< n ; i++ )
        {
			for (int  j = 0; j < n; j++ )
			{
				if (i == n/2 || j == n/2 || i == 0 && j > n/2 || i == n-1 && j < n/2 ||
					j == n-1 && i > n/2	|| j == 0 && i < n/2 || i == 2 && j == 2 || i == 2 
					&& j == 6 || i == 6 && j == 2 || i == 6 && j == 6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
        }

		
		
*		*  * * * * *
*       *
*   *   *   *
*       *
* * * * * * * * *
        *       *
    *   *   *   *
        *       *
* * * * *       *



         for (int i = 0; i < n ; i++ )
         {
			 for (int j = 0; j < n ; j++ )
			 {
				 if (i == n/2 || j == n/2 || i == 0 && j > n/2 || i == n-1 && j < n/2 || 
					 j == n-1 && i > n/2 || j == 0 && i < n/2 || i == j || i+j == n-1)
				 {
					 System.out.print("* ");
				 }
				 else
				 {
					System.out.print("  ");
				 }
			 }
			 
			 System.out.println();
         }
		 
*		* * * * * 
* *     *     *
*   *   *   *
*     * * *
* * * * * * * * *
      * * *     *
    *   *   *   *
  *     *     * *
* * * * *       *




        for (int i = 0; i < n ;i++ )
        {
			for (int j = 0; j < n ; j++ )
			{
				if (i == 0 || i == n-1 || j == 0 || j == n-1 ||i == n/2 || j == n/2 || i == n/4
					|| j == n/4 || i == (3 * n) / 4 || j == (3 * n) / 4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
        }
         
* * * * * * * * * * * * * * * * *
*       *       *       *       *
*       *       *       *       *
*       *       *       *       *
* * * * * * * * * * * * * * * * *
*       *       *       *       *
*       *       *       *       *
*       *       *       *       *
* * * * * * * * * * * * * * * * *
*       *       *       *       *
*       *       *       *       *
*       *       *       *       *
* * * * * * * * * * * * * * * * *
*       *       *       *       *
*       *       *       *       *
*       *       *       *       *
* * * * * * * * * * * * * * * * *
	
*/
	}
}
