import java.util.Scanner;
class FiboPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int ans;
		
		while (true)
		{
		    ans = n1 + n2;
			
			if (n1 == num || n1 > num)
			{
				break;
			}
			else
			{
				n1 = n2;
				n2 = ans;
			}
		}
		
		if (n1 == num)
		{
			int den = 2;
				
				while (den <= num/2)
				{
					if (num % den == 0)
					{
						break;
					}
					den++;
				}
				
				if (den > num/2)
				{
					System.out.println("FiboPrime");
					
				}
				else
				{
					System.out.println("Not FiboPrime");
					
				}
		}
		else
		{
			System.out.println("Not FiboPrime");
			
		}
	}
}
