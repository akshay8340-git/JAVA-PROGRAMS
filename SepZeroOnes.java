import java.util.Scanner;
class SepZeroOnes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Num: ");
		int num = sc.nextInt();
		int ones = 0, zeros = 1;
		while (num != 0)
		{
			if (num % 10 == 1)
			{
				ones = ones * 10 + 1;
			}
			else
			{
				zeros *= 10;
			}
			num/=10;
		}
		
		int ans = ones * zeros;
		System.out.println(ans);
	}
}
