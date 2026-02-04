import java.util.Scanner;
class ScaleConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter scale in Feet: ");
		double feet = sc.nextDouble();
		
		final double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}
}
