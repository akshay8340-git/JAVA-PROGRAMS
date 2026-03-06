import java.util.Scanner;
class AlternateZeroOne
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary num: ");
		int num = sc.nextInt();
		
		int oneCnt = 0;
		int zeroCnt = 0;
		int ans = 0;
		
		while (num != 0)
		{
			if (num % 10 == 1)
			{
				oneCnt++;
			}
			else{
				zeroCnt++;
			}
			
			num/=10;
		}
		// after this loop we get count of 0 and 1 in num
		
		// now we need put numbers alternate position like 1 0 1 0
		// to put 1010 we need to run a loop until the one of the count is become 0
		// after one of it become 0 w'll print remaining numbers as it is
		
		// ex if no has 4 1's and 2 0's it should look like 1010 11 (1's are extra so they printed one after one)
		
		while (zeroCnt > 0 && oneCnt > 0)
		{
			ans = (ans * 10 + 1) * 10;
			// here bracket part give 1 and *10 gives 0 so we are getting 10 at every iteration so we
			// will remove those 0 and 1
			zeroCnt--;
			oneCnt--;
		}
		
		while (oneCnt > 0)
		{
			ans = ans * 10 + 1;
			// this give remaining 1's one after one
		}
		
		while (zeroCnt > 0)
		{
			ans = ans * 10;
			// this give 0's one after one
		}
		
		System.out.println(ans);
	}
}
