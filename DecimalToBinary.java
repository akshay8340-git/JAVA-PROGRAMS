import java.util.Scanner;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		
		int bin = 0;
		int pos = 1;
		
		while (num != 0)  // check until no not becomes 0
		{
			int rem = num % 2; // find the rem 
			bin = bin + rem * pos; // store into bin by multiplying by place
			pos *= 10; // to increase the place value by unit to tens, tens to hundred, hundred to thousand
			num /= 2; //update the no at every iteration
		}
		System.out.println(bin); // Prints binary no
	}
}
