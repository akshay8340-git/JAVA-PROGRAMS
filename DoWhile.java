import java.util.Scanner;
class DoWhile 
{
	public static void main(String[] args) 
	{
		// printing 1 to 100
		int i = 1;
		do
		{
			System.out.println(i);
			i++;
		}
		while (i <= 100);
		
		// Printing A to Z
		char i1 = 'A';
		
		do
		{
			System.out.println(i1);
			i1++;
		}
		while (i1 <= 'Z');
		
		
		// Printing a to z
		char c = 'a';
		
		do
		{
			System.out.println(c);
			c++;
		}
		while (c <= 'z');
		
		// Printing Tables
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No : ");
		int num = sc.nextInt();
		int times = 1;
		
		do
		{
			System.out.println(num + " * " + times + " = " + num * times);
			times++;
		}
		while (times <= 10);
			
	}
}
