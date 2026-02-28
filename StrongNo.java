import java.util.Scanner;
class StrongNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while (num != 0)
		{
			int last = num % 10;
			
			if (last == 0 || last == 1)
			{
				sum += last;
			}
			else
			{
			int fact = 1;
			for (int i = 1; i <= last; i++ )
			{
				fact *= i;
			}
			sum += fact;
			}
			num /= 10;
		}
		
		if (temp == sum)
		{
			System.out.println("Strong no");
		}
		else
		{
			System.out.println("Not Strong no");
		}
		
	}
}
