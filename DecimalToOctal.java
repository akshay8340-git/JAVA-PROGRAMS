import java.util.Scanner;
class  DecimalToOctal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		
		int oct = 0;
		int pos = 1;
		
		while (num != 0)
		{
			int rem = num % 8;
			oct = oct + rem * pos;
			pos *= 10;
			num /= 8;
		}
		System.out.println(oct);
	}
}
