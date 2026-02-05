import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

class Bank
{
	
static String name;
static String address;
static int age;
static long contact;
static long adhar;
static String pan;
static double balance;
static int pin;
static LocalDateTime a;
static ArrayList<String> transaction = new ArrayList<String>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("----WELCOME TO THE BANK----");
		
		firstLoop : 
		for ( ; ; )
		{
			System.out.println("----WELCOME TO MY BANK----");
			
			
			System.out.println("\n 1.CREATE NEW ACCOUNT \n 2.LOGIN \n");
			System.out.println("PLZ CHOOSE WHAT YOU WANT TO DO");
			int opt = sc.nextInt();
			
			switch(opt) {
				case 1 : {
					if (name != null)
					{
						System.out.println("Account already Exists..");
						continue;
					}
					System.out.println("ACCOUNT CREATION IN PROCESS...");
					System.out.println("PLZ ENTER THE FOLLOWING DETAILS..\n");
					System.out.print("Enter Name: ");
					name = new Scanner(System.in).nextLine();
					System.out.print("Enter Your Address: ");
					address = new Scanner(System.in).nextLine();
					System.out.print("Enter Your age: ");
					age = new Scanner(System.in).nextInt();
					System.out.print("Enter your contact: ");
					contact = new Scanner(System.in).nextLong();
					System.out.print("Enter Your adhar: ");
					adhar = new Scanner(System.in).nextLong();
					System.out.print("Enter your pan: ");
					pan = new Scanner(System.in).next();
					System.out.print("Enter Your first Deposit: ");
					balance = new Scanner(System.in).nextDouble();
					a=LocalDateTime.now();
					transaction.add("DEPOSIT CREATION : " + balance + " rs " + 
					(a.getHour()) % 12+ ":" + (a.getMinute()) + ":" + a.getSecond());
					System.out.print("Enter a Pin: ");
					pin = new Scanner(System.in).nextInt();
					
					System.out.println("Your account has been created successfully!!\n");
					break;
				}
				case 2: {
					
					if (name == null)
					{
						System.out.println("Account dont exists PLZ Create it First...\n");
						continue;
					}
					
					System.out.println("Enter Your Valid Credentials..\n");
					System.out.println("Enter contact: ");
					long userct = sc.nextLong();
					System.out.println("Enter Your Pin: ");
					int userpin = sc.nextInt();
					
					if (contact == userct && userpin == pin)
					{
						System.out.println("Login Successful...\n");
					
					
					features :
					for (; ; )
					{
						System.out.println("\n---OPTIONS---\n");
						System.out.println("\n 1.DEPOSITE \n 2.WITHDRAW \n 3.CHECK BALANCE \n 4.Transactions \n5.LOGOUT \n");
						System.out.println("Enter your Option");
						int opt1 = sc.nextInt();
						
						switch (opt1)
						{
						case 1:
							{
						System.out.println("Enter amount you want to deposite: ");
						double deposite = new Scanner(System.in).nextDouble();
						balance += deposite;
						a=LocalDateTime.now();
						transaction.add("Deposit: " + deposite + " rs " + 
						(a.getHour())%12 + ":" + (a.getMinute()) + ":" + a.getSecond());
						System.out.println("Amount Deposited Successfully: ");
						break;
							}
						case 2: {
							
							System.out.println("Enter amount you want to withdraw: ");
							double withdr = new Scanner(System.in).nextDouble();
							System.out.println("Enter your pin: ");
							int newpin = new Scanner(System.in).nextInt();
							
							if (balance < withdr)
							{
								System.out.println("INSUFFICIENT BALANCE : ");
							}
							else if (pin != newpin)
							{
								System.out.println("INVALID CREDENTIALS..");
							}
							else{
								System.out.println("WITHDRAW SUCCESSFUL..");
								balance -= withdr;
								a=LocalDateTime.now();
								transaction.add("WITHDRAW: " + withdr + " rs " + 
								(a.getHour() % 12) + ":" + (a.getMinute()) + ":" + (a.getSecond()));
								
								
							}
							break;
						}
						
						case 3 :
							{
								System.out.println("Enter your pin: ");
								int newpin = new Scanner(System.in).nextInt();
								
								if (pin == newpin)
								{
									System.out.println("your balance is: "+ balance);
								}
								else{
									System.out.println("INVALID PIN TRY AGAIN");
								}
								break;
							
							}
					   case 4 : 
							{
						   System.out.println("---- Transactions----");
						   for (String ele : transaction )
						   {
							System.out.println(ele);   
						   }
						   System.out.println();
						   break;
						   							
							}
							
							 case 5 : 
							{
						   System.out.println("THANK YOU !! VISIT AGAIN !!");
						   continue	firstLoop;							
							}
							
						default:
						{
							System.out.println("Invalid Response..");
						}
						}
					}
					
					}
					else{
						System.out.println("INVALID CREDENTIALS");
					}
					
					break;
				}
				
				default: 
				{
				System.out.println("INVALID OPTION!! ");
				}
				
			}
			
		}
	}
}
