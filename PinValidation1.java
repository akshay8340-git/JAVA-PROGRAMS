import java.util.Scanner;
class PinValidation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME USER");
		int myPin = 1234;
		int attempts = 3;
		int duration = 5000;
		//boolean flag = true;
		
		
		do
		{
			System.out.println("\nEnter Pin");
			int userPin = sc.nextInt();
			
			if (userPin == myPin)
			{
				System.out.println("Success");
				break;
			}
			
			System.out.println("Wrong Pin!!");
			attempts--;
			System.out.println("Attempts left = "+ (attempts));
			
			if (attempts == 0)
			{
				System.out.println("phone disabled for: " + (duration /1000) + " sec");
				Thread.sleep(duration);
				duration *= 2;
				attempts = 3;
			}
			
			
		}
		while (true);
	}
}
