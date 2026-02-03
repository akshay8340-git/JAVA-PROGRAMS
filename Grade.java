import java.util.Scanner;

class Grade
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		double marks = sc.nextDouble();
		
		final int TOTAL = 500;
		
		if (marks < 0 || marks > 500)
		{
			System.out.println("\n INVALID MARKS \n");
			return;
			// System.Exit(0);
			
		}
		
		double perc = (marks / TOTAL) * 100;
		
		String grade = "";
		String remark = "";
		
		if (perc >= 90)
		{
			grade = "O";
			remark = "Excellent!!";
		}
		else if (perc >= 75)
		{
			grade = "A+";
			remark = "First Class Distinction";
		}
		else if (perc >= 60)
		{
			grade = "A";
			remark = "First Class";
		}
		else if (perc >= 50)
		{
			grade = "B";
			remark = "Second Class";
		}
		else if (perc > 35)
		{
			grade = "C";
			remark = "Pass";
		}
		else{
			grade = "F";
			remark = "Fail";
		}
		
		System.out.println(marks);
		System.out.println(perc);
		System.out.println(grade);
		System.out.println(remark);
	}
}
