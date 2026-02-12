import java.util.Scanner;
class ForLoop 
{
	public static void main(String[] args) 
	{
		// Printing 1 to 100
		
		for (int i = 1;i <= 100 ;i++ )
		{
			System.out.println(i);
		}
		
		// Printing A to Z
		
		for (char c = 'A'; c <= 'Z' ;c++ )
		{
			System.out.println(c);
		}
		
		// Printing a to z
		for (char c1 = 'a'; c1 <= 'z';c1++ )
		{
			System.out.println(c1);
		}
		
		// Printing tables
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num");
		int num = sc.nextInt();
		
		for (int i1 = 1; i1 <= 10 ;i1++ )
		{
			System.out.println(num + " * "+ i1 + " = " + num * i1);
		}
		
	
	
	}
}
