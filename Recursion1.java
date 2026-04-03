class Recursion1 
{
	public static void main(String[] args) 
	{
		
	/*	System.out.println(fact(5));
		System.out.println(rev(103,0));
		System.out.println(count(15443,0));
		System.out.println(sum(4329,0));
	*/
		//fibo(4, 0, 1);
		fibo1(3,0,1);
	}
	
	public static int fact(int num)
	{
		return num==0 ? 1 : num*fact(num-1);
	}
	
	public static int rev(int num, int rev)
	{
		return num == 0 ? rev : rev(num/10,rev*10 + num%10);
	}
	
	public static int count(int num, int cnt)
	{
		return num == 0 ? cnt : count(num/10, cnt+1);
	}
	
	public static int sum(int num, int sum)
	{
		return num == 0 ? sum : sum(num/10, sum+(num%10));
	}
	
	public static void fibo(int n, int n1, int n2) 
	{
        if (n == 0)
        {
			return;
        }
		
		System.out.println(n1);
		
		fibo(n-1, n2, n1+n2);
		
    }
	
	public static void fibo1(int n, int n1, int n2)
	{
		if (n == 0)
		{
			return;
		}
		else if (n == 1)
		{
			System.out.println(n1);
			return;
		}
		
		fibo1(n-1, n2, n1+n2);
	}
}
