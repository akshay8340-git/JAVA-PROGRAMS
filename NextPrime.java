import java.util.Scanner;
class NextPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		
		if (num == 0 || num == 1)
		{
			num = 2;
		}  
		while (true)
		{
			int den = 2;
			
			while (den*den <= num)
			{
				if (num % den == 0)
				{
					break;
				}
				den++;
			}
			if (den*den > num)
			{
				System.out.println(num);
				return;
			}
			else
			{
				num++;
			}
		}
	}
}
