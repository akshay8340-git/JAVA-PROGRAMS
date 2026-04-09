class RecRotate 
{
	public static void main(String[] args) 
	{
		System.out.println(rotate(134));
	}
	
	public static int pow(int base, int raise)
	{
		return raise == 0 ? 1 : base * pow(base,raise-1);
	}
	
	public static int count(int num, int cnt)
	{
		return num == 0 ? cnt : count(num/10, cnt+1);
	}
	
	public static int rotate(int num)
	{
		return num%10 * pow(10,count(num/10,0)) + num/10;
	}
}
