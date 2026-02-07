import java.util.Scanner;
class LoanCal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		for (; ; )
		{
			System.out.println("\n----WELCOME-----\n");
			System.out.println("Enter Principal: ");
			double amount  = sc.nextDouble();
			
			if (amount < 1000 || amount > 100000)
			{
				System.out.println("invalid amount");
				continue;
			}
			System.out.println("Enter Rate of Interest: ");
			double interest = sc.nextDouble();
			
			if (interest < 1 || interest > 30)
			{
				System.out.println("invalid interest");
				continue;
			}
			System.out.println("Enter Tenure: ");
			int tenure = sc.nextInt();
			
			if (tenure < 3 || tenure > 20)
			{
				System.out.println("invalid Tenure");
				continue;
			}
			
			double perMonthInt = (amount/100)*interest;
			double totalInterestAmount = perMonthInt * tenure;
			double emi = (amount + totalInterestAmount)/tenure;
			double totalAmount = amount + totalInterestAmount;
			
			System.out.println("\n EMI: " + emi);
			System.out.println("\n interest monthly : " + perMonthInt);
			System.out.println("\n Total InterestAmount : " + totalInterestAmount);
			System.out.println("\n TOtal Amount: \n" + totalAmount);
			
		}
		
	}
}
