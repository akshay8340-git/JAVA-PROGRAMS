import java.util.Scanner;

class CheckChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		/*
		String op = (c >= 48 && c <= 57)?
		(c + " is a digit"):
		(c + " is not a digit");
		
		System.out.println(op);
		
		System.out.println("Enter a char");
		char c1 = sc.next().charAt(0);
		
		String op1 = (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122)?(c1+ "is an alphabet" ):(c1+ "is not a alphabet");
		
		System.out.println(op1);*/
		
		
		String op = 
			((c >= 65 && c <= 90) || (c >= 97 && c <= 122))?
			((c >= 65 && c <= 90) ? (c+ " is an uppercase") : (c + " is a lowercase")):
			((c >= 48 && c <= 57) ? (c + " is an digit") : (c + " is an special character"));
		
		System.out.println(op);
		
	}
}
