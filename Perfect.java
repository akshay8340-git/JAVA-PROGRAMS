import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int sum = 0;
		int den = 1; // start denominator as 1 cause its factor of every number
		
		while (den <= num/2)
		{
			if (num % den == 0)
			{
				sum += den;
			}
			den++;
		}
		
		if (sum == num)
		{
			System.out.println("perfectNO");
		}
		else
		{
			System.out.println("not perfect");
		}
	}
}
