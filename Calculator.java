import java.util.Scanner;

class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first operand: ");
		double op1 = sc.nextDouble();
		
		System.out.println("Enter second operand: ");
		double op2 = sc.nextDouble();
		
		System.out.println("Enter operator");
		char opr = sc.next().charAt(0);
		
		
		double op = 
			opr == '+'?op1 + op2:
			opr == '-' ? op1 - op2:
			opr == '*' ? op1 * op2:
			opr == '/' ? op1 / op2:
			opr == '%' ? op1 % op2:
			Double.MAX_VALUE;
		
		
		
		if (op == Double.MAX_VALUE)
		{
			System.out.println("invalid operator!!!");
		}
		else{
			System.out.println(op);
		}
		
		
				
	}
}
