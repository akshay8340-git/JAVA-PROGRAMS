import java.util.Scanner;
class ArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number ");
		
		int num = sc.nextInt();
		int temp = num;
		int temp1 = num;
		int count = 0;
		
		
		while (temp != 0)
		{
			temp /= 10;
			count++;
		}
		
		int sum = 0;
		
		while (num != 0)
		{
			int result = 1;
			int last = num % 10;
			for (int i = 1; i <= count ; i++)
			{	
			   result = result * last;	
			}
			sum = sum + result;
			num /= 10;
		}
		
		if (temp1 == sum)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not");
		}
		
		
		
		
	
	}
}
