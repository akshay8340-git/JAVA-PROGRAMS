class RotateNTimes 
{
	public static void main(String[] args) 
	{
		System.out.println(rotation(1234,2));
	}
	
	public static int pow(int num)
	{
		int pow = 1;
		
		while (num != 0)
		{
			pow *= 10;
			num /= 10;
		}
		return pow;
	}
	
	public static int rotate(int num)
	{
		
		return num % 10 * pow(num/10) + (num / 10);	
	}
	
    public static int rotation(int num, int k)
	{
		int rot = rotate(num);
		
		while (k != 0)
		{
			rot = rotate(rot);
			k--;
		}
		
		return rot;
	} 
}
