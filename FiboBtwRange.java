import java.util.Scanner;
class FiboBtwRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range starting point: ");
		int start = sc.nextInt();
		System.out.println("Enter ending point: ");
		int end = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int ans;
		
		
		// approach 1
	/*	
	        while (true)
		 {
			 ans = n1 + n2;
			
			if (n1 > end)
		   {
			break;
		   }
		    else if (n1 >= start)
		   {
			System.out.println(n1);
		   }
		   
		   n1 = n2;
		   n2 = ans;
		}
		
	*/
	
	// 2nd approach
	
	
	    while (n1 <= end)
	    {
			 ans = n1 + n2;
			
			if (n1 >= start)
			{
				System.out.println(n1);
			}
			 
			n1 = n2;
			n2 = ans;
	    }
	
	
	
	
		
		
	
	}
}
