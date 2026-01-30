class Population 
{
	public static void main(String[] args) 
	{
		long curPop = 312032486;
		long seconds = (365*24*60*60)*5;
		
		final long BIRTH = seconds / 7;
		final long DEATH = seconds / 13;
		final long IMIGRANTS = seconds / 45;
		
		long newPop = curPop + BIRTH - DEATH + IMIGRANTS;
		System.out.println(newPop);
	}
}
