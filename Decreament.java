class Decreament
{
	public static void main(String[] args) 
	{
		
		int a = 100;
		
		System.out.println(a--); // 100 prints cause first print value then decreament by 1 (real value - 99)
		System.out.println(--a); // 98 decreament 1 and print (real value = 98)
		System.out.println(a--); // 98 prints cause first print values then decreament (real value = 97)
		System.out.println(--a); // 96 decreament 1 and then print real value = 96
		System.out.println(a--); // 96 prints original data and then decreamented by 1 real value = 95
		System.out.println(--a);  // 94 cause decreamented by 1 and print 94
		System.out.println(--a);  // 93 cause decreamented by 1 then print
	}
}
