import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int temp = num;
		int sq = num * num;
		
		int cnt = 0;
		
		while (num != 0)
		{
			num /= 10;
			cnt++;
		}
	//	System.out.println(cnt);
		
		int place = 1;
		/*while (cnt != 0)
		{
			res = res + place * (sq % 10);
			place *= 10;
			cnt--;
			sq /= 10;
		}*/
		
		for (int i = 1; i <= cnt ;i++ )
		{
			place = place * 10;
		}
		
		//System.out.println(res);
		
		
		if (sq % place == temp)
		{
			System.out.println("Automorphic");
		}
		else{
			System.out.println("not automorphic");
		}
	}
}
