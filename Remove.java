import java.util.Scanner;
class Remove 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int rev = 0;
		System.out.println("Which no do u want to remove: ");
		int num1 = sc.nextInt();
		/*
		while (num != 0)
		{
			int last = num % 10;
			if (last == num1)
			{
				num /= 10;
				continue;
			}
			else
			{
				 rev = rev * 10 + last;
			}
			num /= 10;
		}
		
		int ans = 0;
		while (rev != 0)
		{
			 ans = ans * 10 + rev % 10;
			rev /= 10;
		}
		System.out.println(ans);
		*/
		
		int result = 0;
		int place = 1;
		while (num != 0)
		{
			int last = num % 10;
			
			if (num1 != last)
			{
				result = result + last * place;
				place *= 10;
			}
			num /= 10;
		}
		System.out.println(result);
	}
}
