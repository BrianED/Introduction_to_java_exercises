import java.util.*;
public class Exercise2_11 {
	public static void main(String[] args) {
		
		// input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int numberOfYears = in.nextInt();
		
		
		int secondsInAYear = numberOfYears * 365 * 24 * 60 * 60;
		double births = secondsInAYear / 7.0;
		double deaths = secondsInAYear / 13.0;
		double immigrants = secondsInAYear / 45.0;
		int population = 312032486;
		double year = (births + immigrants + population) - deaths;
		System.out.println((int)year);
		
		for(int i = 0 ; i < numberOfYears ; i++) {
			System.out.println((int)year);
		}
	}
}