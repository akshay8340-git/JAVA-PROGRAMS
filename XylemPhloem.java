import java.util.Scanner;
class XylemPhloem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int soe = 0; // soe for sum of edge
		int som = 0; // soe for sum of mid
		
		int last = num % 10; // find last no and add it to soe and remove last no
		soe = soe + last;
		num /= 10;
		
		while (num > 9) // check till no greater than 9 cause if no is 2 digit that is not edge no 
		{
			last = num % 10;	
			som = som + last; // find last digit and add it to som and remove that last no
			num /= 10;
		}
		
		soe = soe + num; // now remaining no is our edge no cause its less than 9 so add to soe
		
		if (soe == som) 
		{
			System.out.println("xylem");
		}
		else
		{
			System.out.println("phloe");
		}
	}
}
