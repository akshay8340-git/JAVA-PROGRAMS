import java.util.Scanner;
class TwinPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prime 1: ");
		int prime1 = sc.nextInt();
		System.out.println("Enter Prime2: ");
		int prime2 = sc.nextInt();
		
		if (prime1 - prime2 != 2 && prime2 - prime1 != 2)
		{
			System.out.println("not a twin prime");
			return;
		}
		
		if (prime1 < 2 || prime2 < 2)
		{
			System.out.println("not a twin prime");
			return;
		}
		
		int den = 2;
		while (den <= prime1 / 2)
		{
			if (prime1 % den == 0)
			{
				break;
			}
			den++;
		}
		
		if (den <= prime1 / 2)
		{
			System.out.println("not a twin prime");
		}
		else
		{
			den = 2;
			while (den <= prime2 / 2)
			{
				if (prime2 % den == 0)
				{
					break;
				}
				den++;
			}
			
			if (den > prime2 / 2)
			{
				System.out.println("a twin prime");
			}
			else
			{
				System.out.println("not twin prime");
			}
			
		}
		

	}
}
