class CompoundAssignmentOperator
{
	public static void main(String[] args) 
	{
		
		// Normal Assignment Operator..
		
		/*
		int a = 100;
		System.out.println(a);  // Print 100
		
		a = a + 100;  // Print 200 cause in a variable 'a' 100 is Stored and it is assigned back to 'a' itself 
		System.out.println(a);
		
		// Using Compound Assignment Operator
		
		int a1 = 1000;
		a1 += 100;   // a = a + 100;  same thing done using compund assignment operator.
		System.out.println(a1);  
		
		
		int a2 = 1000;
		a2 -= 200;  // a = a - 200 (1000 - 200) stored back to a2
		System.out.println(a2);
		
		
		int a3 = 15;
		a3 *= 5;   // a3 = a3 * 5 (15 * 5) stored back to a3
		System.out.println(a3);
		
		int a4 = 1000;
		a4 /= 100;  // a4 = a4 / 100 (1000/100) stored back to a4
		System.out.println(a4);
		
		int a5 = 1000;
		a5 %= 150;  // a5 = a5 / 100 (1000/150) stored back to a5
		System.out.println(a5);
		*/
		
		
		int a,b,c,d,e;
		a = 10;
		b = 20;
		c = 50;
		d = 40;
		int ans = a += b -= c *= d /= 20;
		
/* first operation will start from right side so d/=20(40/20)=2 so 2 stored at d then c*= 2(d's new value)
 so 50 * 2 = 100 so 100 stored at c then b -= 100(c's new value) so 20 - 100 = -80 so -80 stored at b
 then a += -80(b's new value) so 10 + (-80) = -70 (a's new value) this value assigned to ans variable.*/
		
		System.out.println(ans); // this gives -70.
	
	}
}
