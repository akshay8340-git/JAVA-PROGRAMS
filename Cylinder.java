import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		
		System.out.println("Enter height");
		double height = sc.nextDouble();
		
		final double PI = 22.0/7.0;
		final double AREA = PI  * radius * radius;
		final double VOLUME = AREA * height;
		xx
		System.out.printf("Area of Cylinder: %.3f %n" , AREA);
		System.out.printf("Volume of Cylinder: %.3f " , VOLUME);
	}
}
