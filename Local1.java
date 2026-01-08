class Local1 
{
	public static void main(String[] args) 
	{
		int a = 100; // local variable for main method and scope starts here for this variable
		
		{
			
			char a = 'z';  // can't redeclare 'a' here here it will give compile time error because scope of variable 'a' in main method is still visible here 
			System.out.println(a);
		}
		 
		 
		 // still here the scope of varible 'a' of main method is visible.
	}
}
