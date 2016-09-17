import java.util.*;
public class Exercise2_7 {
	
	public static void main(String[] args) {
		
		// user enters a number of minutes
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int numberOfMinutes = in.nextInt();
		
		// calculate number of years and days
		double numberOfMinutesInYear = 60 * 24 * 365;
		double years = numberOfMinutes / numberOfMinutesInYear;
		double days = (numberOfMinutes / 60 / 24) % 365;
		System.out.println(years + " " + days);
		double numberOfHours = numberOfMinutes / 60;
		double numberOfDaysFromHours = numberOfHours / 24;
		double numberOfYears = numberOfDaysFromHours / 365;
		System.out.println(numberOfDaysFromHours % 365);
		double numberOfDaysLeftover = numberOfDaysFromHours % 365;
		
		
		// display
		System.out.println(numberOfMinutes + " minutes is approximately "
		+ (int)numberOfYears + " years and " + (int)numberOfDaysLeftover + " days");
		
	}
}