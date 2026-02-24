import java.util.Scanner;
class PalindromicFibo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int ans;
		int rev = 0, temp = num;
		
		while (n1 <= num)
		{
			ans = n1 + n2;
			
			if (n1 == num)
			{
				while (num != 0)
				{
					rev = rev * 10 + (num % 10);
					num /= 10;
				}
				
				if (rev == temp)
				{
					System.out.print("palindromic Fibo");
					break;
				}
				else
				{
					System.out.println("not palindromic fibo");
					break;
				}
			}
			else if (n1 > num)
			{
				System.out.println("not palindromic fibo");
				break;
			}
			else
			{
				n1 = n2;
				n2 = ans;
			}
		}
	}
}
