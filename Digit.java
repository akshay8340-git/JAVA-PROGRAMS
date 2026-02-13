import java.util.Scanner;
class Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		/*
		while (num > 0)
		{
			int last = num % 10;
			System.out.println(last);
			num = num / 10;
		}
		
		
		int count = 0;
		while (num > 0)
		{
			num /= 10;	
			count++;
		}
		System.out.println(count);
		
		
		
		while (num > 0)
		{
			int last = num % 10;
			if (last % 2 == 0)
			{
				System.out.println(last);
			}
			num /= 10;
		}
		
		
		boolean zero = false;
		
		while (num > 0)
		{
			int last = num % 10;
			
			if (last == 0)
			{
				zero = true;
				break;
			}
			num /= 10;
		}
		
		if (zero == true)
		{
			System.out.println("zero exists");
		}
		else
		{
			System.out.println("dont exists");
		}
		
		
		
		
		int count = 0;
		
		while (num > 0)
		{
			int last = num % 10;
			if (last == 0)
			{
				count++;
			}
			num /= 10;
		}
		
		if (count > 0)
		{
			System.out.println("Zero Exists");
		}
		else
		{
			System.out.println("Dont exists");
		}
		
		*/
		
		int oddCount = 0;
		int evenCount = 0;
		
		while (num > 0)
		{
			int last = num % 10;
			if (last % 2 == 0)
			{
				evenCount++;
			}
			else 
			{
				oddCount++;
			}
			
			num /= 10;
		}
		
		System.out.println("Odd COUNT : " + oddCount);
		System.out.println("Even Count : " + evenCount);
		
		
	}
}
