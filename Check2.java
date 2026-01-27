import java.util.Scanner;

class Check2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		//alphabet or not
		
		/*
		System.out.println("Enter a char");
		char c1 = sc.next().charAt(0);
		
		String op1 = (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122)?(c1+ "is an alphabet" ):(c1+ "is not a alphabet");
		
		System.out.println(op1);*/
		
		//digit or not
		
		/*
		System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		
		String op = (c >= 48 && c <= 57)?
		(c + " is a digit"):
		(c + " is not a digit");
		
		System.out.println(op);*/
		
		//special character or not
		
		/*System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		
		String op = (c>=0 && c<= 47 || c>=58 && c<= 64 || c >= 91 && c <= 96 || c>=122 && c <= 127)?
			        (c + " is an speacial character"):
			        (c+ "is not a special character");
		
		System.out.println(op);*/
		
		// to check uppercase lowercase or not a alphabet
		
		/*System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		
		String op = 
			(c >= 65 && c <= 90 || c > 97 && c <= 122)?
			(c >= 65 && c <= 90 ? (c+ " is a uppercase") : (c+ " is a lowercase")):
			(c+ "not a alphabet");
		
		System.out.println(op);*/
		
		//  alphabet digit or special character
		
		/*System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		
		String op = (c >= 65 && c <= 90 || c >= 97 && c <= 122)?
			        (c + " is an alphabet"):
			        (c >= 48 && c <= 57 ? c+ " is an digit" : c+ " is a special character");
		
		System.out.println(op);*/
		
		// uppercase,lowercase,digit or special character
		
		/*System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		
		String op = 
			(c >= 65 && c <= 90 || c >= 97 && c <= 122)?
			(c >= 65 && c <= 90 ? c + "is an uppercase" : c +" is a lowercase"):
			(c >= 48 && c <= 57 ? c+ " is an digit" : c+ " is a special character");
		System.out.println(op);*/
		
		//  Check Vowel or Consonant
		
		/*System.out.println("Enter a char");
		char c = sc.next().charAt(0);
		
		String op = 
			(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')?
			(c + " is an vowel"):
			(c + " is a consonant");
		
		System.out.println(op);*/
		
		
		// leap year or not
		
		/*System.out.println("Enter a year");
		int year = sc.nextInt();
		
		String op =
			(year % 400==0 ||  year % 100!= 0 )?
			(year % 4 == 0 ? "its a leap year" : "its not leap year"):
			("its not a leap year");
		
		System.out.println(op);*/
		
		// positive negative 
		
		/*System.out.println("Enter a value");
		int value = sc.nextInt();
		
		String op = 
			(value >= 0)?
			(value+ " is an positive"):
			(value + " is a negative");
		System.out.println(op);*/
		
		// positive negative or not
		
		/*System.out.println("Enter a value");
		int value = sc.nextInt();
		
		String op = 
			(value >= 0)?
			(value != 0 ? (value+ " is a positive") : (value + " is a zero")):
			(value + " is negative");
		System.out.println(op);*/
		
		// even or odd
		
		/*  System.out.println("Enter a value");
		int value = sc.nextInt();
		
		String op = 
			(value % 2 == 0)?
			(value+ " is a even"):
			(value+ " is odd");
		System.out.println(op);*/
		
		
		// Absolute Value
		System.out.println("Enter a value");
		int value = sc.nextInt();
		
		int op = 
			(value < 0)?
			(value * -1):
			(value);
		
		System.out.println(op);
	}
}
