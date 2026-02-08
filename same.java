class same 
{
	public static void main(String[] args) 
	{
		
		
		//char c  = 100;
		//System.out.println(c); // It give output as 'd'
		// here 100 is a compile time constant and we storing it in char thats why it give d
		
		//char c1 = 70000;
		//System.out.println(c1); IT give error cause even 70000 is compile time constant but cant store
		//cause char range is 65535 and 70000 > 65535
		
		//System.out.println((int)c); 
		// it give output as 100 cause using typecast operator
		
		//char c1 = 1000;
		//System.out.println((byte)c1);
		// it give output as -24 cause using typecast into byte 
		
		//char ch = 'A';
		//System.out.println(ch); // it give output as 65
		
		//char ch1 = 'A';
		//System.out.println(ch1 + 1); // It give 66 ; here 1 is a compile time constant
		
		//char ch2 = 'A';
		//c = ch2 + 1; // here 1 is not compile time constant its considered as int we are storing int into char
		// so it give CTE
		//System.out.println(c);
		
		//char ch3 = 'A';
		//c = (char)ch3 + 1;
		//System.out.println(c); // this also give CTE even using type cast cause here it is converting ch3 into 
		// char means (char(ch3)) not + 1 so here 1 is still int. (BRACKET IS IMP)
		
		//char ch4 = 'A';
		//c = (char) (ch4+1);
		//System.out.println(c); // This give output as 'B'
		// here ch4+1 is converted into char using type cast (BRACKET IS IMP)
		
		//char c = 'A';
        //c += 1;
        //System.out.println(c); // This is equals to above code
		
		// final char ch5 = 'A';
        // char d = ch5 + 1;   
		// System.out.println(d); This give output as B
		
		
		//char c = '$';
		//System.out.println(x);
		// This prints $
		
		//char c = '$';
		//int x = c;
		//System.out.println(x);
		// this prints 36
		
		//char c = 'a';
		//System.out.println(c);
		// this give 97
		
		//char c = 'a';
		//System.out.println(c+1);
		// This gives 98
		
		//char c = '5';
		//int c1 = c - 5;
		//System.out.println(c1);
		
		
		//System.out.println('a' - 4);





	}
}
