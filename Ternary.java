import java.util.Scanner;


class Ternary
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		/*
		int a = 15;
		int b = 20;
		int greatest = a > b ? a : b;
		
		String oddEven = a % 2 == 0 ? "Even" : "odd" ;
		
		System.out.println(greatest);
		System.out.println(oddEven);
		
		System.out.println("enter your marks: ");
		int marks = sc.nextInt();
		
		String passFail = marks >= 40 ? "pass" : "fail";
		System.out.println(passFail);
		
		
		System.out.println("Enter Number to Convert into absolute value : ");
		int value = sc.nextInt();
		
		int abs = value >= 0 ? value : -value;
		System.out.println(abs);
		
		System.out.print("enter first no : ");
		int first = sc.nextInt();
		
		System.out.println("enter second no: ");
		int second = sc.nextInt();
		
		int smallest = first < second ? first : second;
		System.out.println("smallest is: " + smallest);
		
		System.out.println("enter a char: ");
		
		char ch = sc.next().charAt(0);
		
		String vowel = (ch == 'a'|| ch =='e'|| ch=='i'||ch =='o'||ch =='u') ? "vowel" : "consonant" ;
		System.out.println(vowel);
		
		
		System.out.println("enter your age :");
		int age = sc.nextInt();
		
		String status = age >= 0 ? "eligible" : "not eligible";
		System.out.println(status);
		
		
		System.out.println("enter first value: ");
		int first = sc.nextInt();
		
		System.out.println("enter second value: ");
		int second = sc.nextInt();
		
		System.out.println("enter third value: ");
		int third = sc.nextInt();
		
		int largest = (first > second ? first : second) > third ? (first > second ? first : second) : third;
		System.out.println(largest);*/
		
		System.out.println("enter your marks: ");
		int marks = sc.nextInt();
		
		String grade = marks >= 90 ? "A" : marks >= 75 ? "B" : marks >= 50 ? "C" : "Fail";
		System.out.println(grade);
		
		
		
		
	}
}
