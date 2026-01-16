class LogicalOperator 
{
	public static void main(String[] args) 
	{
		
		System.out.println(true && true);          // true
		System.out.println(9%3 == 0 && 10%2 == 0); //true
		System.out.println('a'=='A' && false);     //false
		System.out.println(!false);                // true
		System.out.println(!true || false);        //false
		System.out.println(!false || !true);       // true
		System.out.println(!true && !true);        //false
		System.out.println(!false || false);       // true
		System.out.println('a' > 'A' && 97 < 65);  //false
		System.out.println(!false || false);       //true
		
	}
}
