import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		
		while (num != 0)
		{
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		if (rev != temp)
		{
			System.out.println("not palindromic no");
			return;
		}
		else
		{
			int den = 2;
			
			while (den < temp)
			{
				if (temp % den == 0)
				{
					System.out.println("not palindromic no");
					break;
				}
				den++;
			}
			
			if (den == temp)
			{
				System.out.println("palindromic no");
			}
		}	
	}	
}




