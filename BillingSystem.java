import java.util.Scanner;
class BillingSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double cartValue = 0.0;
		forLoop : 
		for (; ; )
		{
			System.out.println("\nChoose which items you want to add!! \n");
			System.out.println(" 1. Oats - 150Rs \n 2. peanut Butter - 300Rs \n 3. Protein Bar - 40Rs\n");
			
			int opt = sc.nextInt();
			
			if (opt == 1)
			{
				cartValue += 150;
			}
			else if (opt == 2)
			{
				cartValue += 300;
			}
			else if (opt == 3)
			{
				cartValue += 40;
			}
			else 
			{
				System.out.println(" \n Invalid Option \n ");
				continue;
			}
			System.out.println(" \n U want to add more items \n ");
			String resp = sc.next().toUpperCase();
			
			if (resp.equals("YES"))
			{
				continue forLoop;
			}
			else if (resp.equals("NO"))
			{
				System.out.println("\n Thank U For Shopping");
				break;
			}
			
		}
		
		if (cartValue > 299)
		{
			System.out.println("25% Discount Activated!!");
			cartValue = cartValue - cartValue * 25 / 100;
			System.out.println("After Discount: " + cartValue);
		}
		else
		{
			System.out.println("You have to pay: " + cartValue);
		}
	
	}
}
