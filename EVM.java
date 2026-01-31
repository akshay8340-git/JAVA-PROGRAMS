import java.util.Scanner;
class EVM
{
	static int bjp,cong,mns,shivsena,ncp;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("****Welcome to EVM ****\n");
		System.out.println("Enter a population");
		int population = sc.nextInt();
		
		for(int i = 1; i <= population; i++){
			System.out.println(" *****Welcome!! PLZ Enter your Vote******");
			System.out.println(" 1.BJP \n 2.Cong \n 3.MNS \n 4.Shivsena \n 5.NCP\n");
			System.out.println("Enter your Response: ");
			String response = sc.next().toUpperCase();
			
			if (response.equals("BJP"))
			{
				bjp++;
				System.out.println("You Voted for BJP\n");
			    
			}
			
			else if(response.equals("CONG"))
			{
				cong++;
				System.out.println("You voted for cong\n");
				
			}
			
			else if(response.equals("MNS"))
			{
				mns++;
				System.out.println("You voted fot MNS\n");
				
				
			}
			
			else if(response.equals("SHIVSENA"))
			{
				shivsena++;
				System.out.println("You voted fot shivsena\n");
				
			}
			
			else if(response.equals("NCP"))
			{
				ncp++;
				System.out.println("You voted for ncp\n");
				
			}
			else{
				System.out.println("No Such Party!!!\n");
				i--;
			}
		}
		
		System.out.println("bjp Votes: "+ bjp);
		System.out.println("mns Votes: "+ mns);
		System.out.println("Shivsena votes: "+ shivsena);
		System.out.println("ncp votes: "+ ncp);
		System.out.println("cong votes : "+ cong);
		
		
		if (bjp >= cong && bjp >= mns && bjp >= ncp && bjp >= shivsena)
		{
			System.out.println("bjp won the elections by " + bjp);
		}
		else if (cong >= bjp && cong >=  ncp && cong >= shivsena && bjp >= mns)
		{
			System.out.println("cong won the elections by" + cong);
		}
		else if (shivsena >= bjp && shivsena >= mns && shivsena >= ncp && shivsena >= cong)
		{
			System.out.println("shivsena won the elections by" + shivsena);
		}
		else if (ncp >= bjp && ncp >= mns && ncp >= shivsena && ncp >= cong)
		{
			System.out.println("ncp won the elections by " + ncp);
		}
		else
		{
			System.out.println("mns won the elections by " + mns);
		}
	}
}
