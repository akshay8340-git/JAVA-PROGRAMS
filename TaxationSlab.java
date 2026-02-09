import java.util.Scanner;
class TaxationSlab 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Salary");
		double sal = sc.nextDouble();
		
		double tax = 0;
		
		if (sal < 0)
		{
			System.out.println("Invalid Salary");
			return;
		}
		
		if (sal <= 400000)
		{
			System.out.println("You dont need to pay");
			return;
		}
		
		if (sal > 2400000)
		{
			tax = tax + (sal - 2400000) * 30 / 100;
			sal = 2400000;
		}
		if (sal >2000000)
		{
			tax = tax + (sal - 2000000) * 25 / 100;
		    sal = 2000000;
		}
		if (sal > 1600000)
		{
			tax = tax + (sal - 1600000) * 20 / 100;
			sal = 1600000;
		}
		if (sal > 1200000)
		{
			tax = tax + (sal - 1200000) * 15 / 100;
			sal = 1200000;
		}
		if (sal > 800000)
		{
			tax = tax + (sal - 800000) * 10 / 100;
			sal = 800000;
		}
		if (sal > 400000)
		{
			tax = tax + (sal - 400000) * 5 /100;
			sal = 400000;
		}
		
		if (tax > 0)
		{
			System.out.printf("%n you have to pay %.2f Rs Tax %n",tax);
		}
	}
}
