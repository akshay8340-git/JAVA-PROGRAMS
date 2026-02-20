import java.util.Scanner;
class Fibo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter terms: ");
		int terms = sc.nextInt();
		int n1 = 0;  // first term
		int n2 = 1;  // second term;
		int ans;
		
		// Use for loop if u want to use your terms later in the program 
		// if we use while loop we have to decrease the terms everytime it cant be used later in program.
		
		for (int i = 1; i <= terms ;i++ )
		{
			ans = n1 + n2;
			System.out.println(n1);  //print n1 cause we want to start from 0 if we print ans here will start
			// from 1,2,3,5.....terms and n1 is updating in every iteration
			
			n1 = n2; // new n1 updation :  the value of n2 is given to n1 after every iteration.
			n2 = ans;// new n2 updation : the value of ans is given to n2 after every iteration.
		}
	}
}
