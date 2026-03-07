import java.util.Scanner;
class NthPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start: ");
		int start = sc.nextInt();
		
		System.out.println("Enter term");
		int term = sc.nextInt();
		int cnt = 0;
		while (true)
		{
			int den = 2;
			
			if (start == 0 || start == 1)
			{
				start = 2;
			}
			
			while (den * den <= start)
			{
				if (start % den == 0)
				{
					break;
				}
				den++;
			}
			
			if (den * den > start)
			{
				cnt++;
			}
			
			if (cnt == term)
			{
				System.out.println(start);
				break;
			}
			start++;
		}
	}
}
