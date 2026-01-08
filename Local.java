class Local 
{
	int a = 110; // global variable here this variable is visible in whole program cause its global variable
	public static void main(String[] args) 
	{
	
		{
			int a = 10; // local variable here this is visible within this block only.
			System.out.println(a);
		}
		
		{
			int a = 20; // here variable name is same as above block but it is in different block so its allowed.
			System.out.println(a);
		}
		

	}
}
