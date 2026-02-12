import java.util.Scanner;
class WhileLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("Printing 1 to 100");
		int i = 1;
		while(i <= 100){
			System.out.println(i);
			i++;
		}
		
		System.out.println("Printing A to Z");
		char c = 'A';
		while (c <= 'Z')
		{
			System.out.println(c);
			c++;
		}
		
		System.out.println("Printing A to Z");
		char c1 = 'a';
		while(c1 <= 'z')
		{
			System.out.println(c1);
			c1++;
		}
		
		System.out.println("Printing Tables");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int i1 = 1;
		while (i1 <= 10)
		{
			System.out.printf("%d * %d = %d%n" , num ,i1, num*i1);
			i1++;
		}
		
	}
}
