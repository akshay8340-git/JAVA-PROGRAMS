import java.util.Scanner;
class CurrencyConvertor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		for (; ; )
		{
			System.out.println(" \nWelcome Human\n");
			System.out.println("********Currency Convertor********");
			
			System.out.println("Enter your amount: ");
			double amount = sc.nextDouble();
			
			System.out.println("\n 1.USD \n 2.AUD \n 3.GBP \n 4.CAD \n 5.EUR \n 6.AED \n 7.ZAR \n 8.NZD \n 9.TWD \n 10.KPW \n");
			
			System.out.println("Enter your response: ");
			String resp = sc.next().toUpperCase();
			
			boolean assump = true;
			double convertedAmount = 0;
			
			if (resp.equals("USD"))
			{
				convertedAmount = amount / 90.14;
			}
			else if (resp.equals("AUD"))
			{
				convertedAmount = amount / 63.33;
			}
			else if (resp.equals("GBP"))
			{
				convertedAmount = amount / 123.31;
			}
			else if (resp.equals("CAD"))
			{
				convertedAmount = amount / 65.90;
			}
			else if (resp.equals("EUR"))
			{
				convertedAmount = amount / 106.43;
			}
			else if (resp.equals("AED"))
			{
				convertedAmount = amount / 24.53;
			}
			else if (resp.equals("ZAR"))
			{
				convertedAmount = amount / 5.63;
			}
			else if (resp.equals("NZD"))
			{
				convertedAmount = amount / 54.44;
			}
			else if (resp.equals("TWD"))
			{
				convertedAmount = amount / 2.85;
			}
			else if (resp.equals("KPW"))
			{
				convertedAmount = amount / 0.10;
			}
			else{
				System.out.printf("%10s , Invalid Response Human!! PLZ TRY AGAIN");
				assump = false;
			}
			
			if (assump)
			System.out.printf("\nYour Converted amount is %.2f %s%n", convertedAmount,resp);
		}
		
	}
}
