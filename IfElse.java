import java.util.Scanner;
class IfElse
 
{
	public static void main(String[] args) 
	{
		// Vowel or Consonant
		System.out.println("Execution Starts");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char : ");
		char c = sc.next().charAt(0);
	
			
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' 
			|| c == 'I'	 || c == 'O' || c == 'U')
		{
			System.out.println(c + " is a vowel");
		}
		else
		{
			System.out.println(c + " is a consonant");
		}
		
		// Odd or Not
		
		System.out.println("");
		System.out.println("Enter a num : ");
		int a = sc.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println(a + " is even");
		}
		else{
			System.out.println(a + " is odd");
		}
		System.out.println("Execution Ends");
				
	}
}
