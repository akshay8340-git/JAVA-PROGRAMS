import java.util.Scanner;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		
		while (num > 1) // keep dividing no by 2,3,5 until it become 1
		{
			if (num % 2 == 0) // first check no divisibility if it is divisible by 2 then divide it by 2 and store ans in num
			{
				num /= 2;
			}
			else if (num % 3 == 0) // if num is divisible by 3 divide it by 3 and store in num
			{
				num /= 3;
			}
			else if (num % 5 == 0)  //if num is divisible by 5 divide it by 5 and store in num
			{
				num /= 5;
			}
			else
			{
				break; // if not divisible by 2,3 and 5 break the looop 
			}
		}
		
		if (num == 1)
		{
			System.out.println("Its ugly no"); //after loop if num become 1 that means its prime factors 
			//are 2,3 or 5 and its ugly number
		}
		else
		{
			System.out.println("its not"); // else not	
		}
		
		
	}
}
