class ConditionalOperator
{
	public static void main(String[] args) 
	{
		
		// To check Bigger Number
		int a = 40;
		int b = 30;
		 
		String ans = a>b ? "a is bigger" : "b is bigger";
		System.out.println(ans);
		
		
		// To Check No is Odd or Even
		int a1 = 65;
		
		String ans1 = a1%2==0 ? "a1 is even" : "a1 is odd";
		System.out.println(ans1);
		
		// To Check Bigger Number out of 3 Numbers
		int a2 = 101;
		int b2 = 67;
		int c2 = 99;
		 
		
	    int ans3 = a2>b2 ? a2 : b2;
		System.out.println(ans3);
		
		int ans4 = ans3>c2 ? ans3 : c2;
		System.out.println(ans4);
		
		// To Check Bigger No Out Of 3 Numbers
		int a3 = 90;
		int b3 = 99;
		int c3 = 88;
		
		int ans5 = a3>b3 ? (a3>c3 ? a3 : c3) : (b3>c3 ? b3 : c3);
		System.out.println(ans5);
		
	}
}
