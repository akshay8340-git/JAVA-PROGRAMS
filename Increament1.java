class Increament1
{
	public static void main(String[] args) 
	{
		int p = -3, q = 8, r = 13, s;
		
		s = p++ - q-- * r;
		q = --p + s++ - --q;
		p = p++ * p-- + r;
		r = r--;
		
		
		System.out.println("s " + p);
		System.out.println("p"+q);
		System.out.println("r" +r);
		System.out.println("s" + s);
	}
}
