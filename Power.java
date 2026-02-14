import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		int base = sc.nextInt();
		
		System.out.println("Enter raise");
		int raise = sc.nextInt();
		
		// Using While Loop
		/*int tempRaise = raise;
		
		
		while (raise > 0)
		{
			result = result * base;
			raise--;
		}
		System.out.println(base + " raised to "+ tempRaise +" = "+ result);
		*/
		
		//Using ForLoop
		
		int result = 1;
		for (int i = 0; i < raise; i++ )
		{
			result = result * base;
		}
		System.out.println(base + " raised to " + raise + " = " + result);
	}
}
