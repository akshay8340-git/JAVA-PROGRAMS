class LargestNo
{
	public static void main(String[] args) 
	{
		
		int a = 20,b=30,c=35,d=36;
		System.out.println(b);
		
		int large1 = a > b ? a : b;
		int large2 = c > d ? c : d;
		int largest = large1 > large2 ? large1 : large2;
		System.out.println(largest);
		
		int secondlarge = large1 > large2 ? large2 : large1;
		System.out.println(secondlarge);
		
	}
}
