class Speed 
{
	public static void main(String[] args) 
	{
		double distanceKm = 14;
		double distanceMile = 14/1.6;
		double seconds = 45*60 + 30;
		double hours = seconds / 3600.0;
		double speed = distanceMile / hours;
		
		
		System.out.printf("Speed in Miles per Hour: %.3f" , speed);
	}
}
