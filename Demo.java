import java.util.Scanner;

class Demo
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string: ");
		String s1 = sc.next();
		
		System.out.println(s1); // suppose i entered string "akshay bandenavaru" this just returns akshay 
		                        //in buffer there is " bandenavaru"
		
	/*  System.out.println("enter string: ");
		String s2 = sc.next(); 
		
		System.out.println(s2); this returns bandenavaru cause we used sc.next() it return 
		                          remaining word from buffer */
		
	/*	System.out.println("enter string 2: ");
		char c = sc.next().charAt(0); 
		
		System.out.println(c);  // this returns output as 'b' cause in buffer their is still 
		        " bandenavaru" present so it trim the space and return the char present at 0 index */ 
		
	/* 	System.out.println("enter string 2: ");
		char c1 = sc.nextLine().charAt(0);
		
		System.out.println(c1);  this returns output as whitespace " " cause in buffer their is " bandenavaru" 
		and nextline take all it as a string and returns whitespace cause it is present at 0th index it dont
		trims the whitespace before taking char at index position.  */
		
	}
}
