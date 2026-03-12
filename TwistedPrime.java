import java.util.Scanner;
class TwistedPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		
		int den = 2;
		int tempDen = den;
		int rev = 0;
		
		if (num <= 1)
		{
			System.out.println("It is Not Twisted Prime No");
			return;
		}
		
		while (den < num)
		{
			if (num % den == 0)
			{
				break;
			}
			den++;
		}
		
		if (den != num)
		{
			System.out.println("It is Not Twisted Prime No");
			return;
		}
		else
		{
			while (num != 0)
			{
			rev = rev * 10 + num % 10;
			num /= 10;
			}
			
			
			while (tempDen < rev)
			{
				if (rev % tempDen == 0)
				{
					break;
				}
				tempDen++;
			}
			
			if (tempDen == rev)
			{
				System.out.println("It Is Twisted Prime No");
			}
			else
			{
				System.out.println("It is Not Twisted Prime No");
			}
		}
		
		
	}
}
