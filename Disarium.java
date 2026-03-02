import java.util.Scanner;
class Disarium 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("num: ");
		int num = sc.nextInt();
		
		int cnt = 0, sum = 0;
		
		for (int i = num; i != 0 ; i/= 10 )
		{
			cnt++;
		}
		//System.out.println(cnt);
		
		
		for (int j = num;j!=0;j/=10 )
		{
			int last = j % 10;
			
			int power = 1;
			
			for (int k = 0; k < cnt ; k++ )
			{
				power *= last;
			}
			
			sum += power;
			cnt--;
		}
		
		if (sum == num)
		{
			System.out.println("disarium");
		}
		else
		{
			System.out.println("not");
		}
	}
}
