import java.util.Scanner;

class DynamicRead
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your name :");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Your College: ");
		String college = sc.nextLine();
		
		System.out.print("Enter Your CGPA: ");
		double cgpa = sc.nextDouble();
		
		System.out.print("Enter Your PhoneNo: ");
		long phone = sc.nextLong();
		sc.nextLine();
		
		System.out.print("Enter Your bloodgroup: ");
		String bg = sc.nextLine();
		
		System.out.print("Enter your grade: ");
		char grade = sc.next().charAt(0);
		
		System.out.println("  ");
		
		
		System.out.println("Your Name Is: " + name);
		System.out.println("Your Age is: " + age);
		System.out.println("Your College is: " + college);
		System.out.println("Your CGPA is: " + cgpa);
		System.out.println("Your phone no is: " + phone);
		System.out.println("Your blood group is " + bg);
		System.out.println("Your Grade is: " + grade);
		
		
		
	}
}
