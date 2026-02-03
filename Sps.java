import java.util.Scanner;

class Sps
{
	public static void main (String [] args)
	{
		
	System.out.println("Welcome to Rock Paper Scissor");
	Scanner sc = new Scanner(System.in);
	
	infiniteLoop :
		for (; ; )
		{
		System.out.println("\n 1. Rock \n 2. Paper \n 3. Scissor \n");
		System.out.println("Enter your response: \n ");
		int dgtUser = sc.nextInt();
		String user = "";
		
		if (dgtUser == 1) user = "Rock";
		else if (dgtUser == 2) user = "Paper";
		else if (dgtUser == 3) user = "Scissor";
		else {
			System.out.println("\n INVALID RESPONSE HUMAN!! TRY AGAIN \n ");
			continue infiniteLoop;
		}
		
		
		// bot implementation
		int dgtBot = 0;
		for (; ; )
		{
			dgtBot =(int)(Math.random()*10);
			if (dgtBot >= 1 && dgtBot <= 3)
				break;
		}
		
		String bot = "";
		
		if (dgtBot == 1) bot = "Rock";
		else if (dgtBot == 2) bot = "Paper";
		else bot = "Scissor";
		
		System.out.printf("%n%10s %10s", "BOT" , "USER");
		System.out.printf("%n%10s %10s", bot,user);
		
		if (bot.equals("Rock") && user.equals("Scissor") || 
			bot.equals("Paper") && user.equals("Rock") ||
			bot.equals("Scissor") && user.equals("Paper"))
		{
			System.out.println("\n\nBOT WON");
		}
		
		else if 
			(bot.equals("Rock") && user.equals("Paper") ||
			bot.equals("Paper") && user.equals("Scissor") ||
			bot.equals("Scissor") && user.equals("Rock"))
		{
			System.out.println("\n\nUSER WON");
		}
		else{
			System.out.println("\n\nIT'S DRAW");
		}
			
		
		}
	}
}