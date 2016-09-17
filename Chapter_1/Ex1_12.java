public class Ex1_12 {
	
	public static void main(String[] args) {
		// convert total time to seconds 
		double totalTimeInSeconds = (60 * 60) + (40 * 60) + 35;
		
		// calculate mph by dividing the total miles by time taken
		double mphInSeconds = 24 / totalTimeInSeconds;
		
		// convert mph in seconds back to hours
		double mph = mphInSeconds * 60 * 60;
		
		// get time for one mile in seconds
		double oneMileInSeconds = 24.0 / totalTimeInSeconds;
		
		// convert 1 mile into km in seconds
		double convertOneMileIntoKm = oneMileInSeconds * 1.60934;
		
		// write out kmph converting back to hours
		double kmph = convertOneMileIntoKm * 60 * 60;		
		
		System.out.printf("mph is %.2f and kmph " 
		+ "is %.2f to 2 decimal places",mph,kmph);
	}
}