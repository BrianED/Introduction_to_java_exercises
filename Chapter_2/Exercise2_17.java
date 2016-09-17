import java.util.Scanner;
public class Exercise2_17 {
	
	public static void main(String[] args) {
		
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58"
		+"F and 41F: ");
		double temperature = in.nextDouble();
		System.out.print("Enter the wind speed in miles per hour >=2: ");
		double windSpeed = in.nextDouble();
		
		// formula
		double windChill = 35.74 + 0.6215 * temperature - 35.75
		* (Math.pow(windSpeed,0.16)) + 0.4275 * temperature
		* (Math.pow(windSpeed,0.16));
		
		// display
		System.out.println("The wind chill index is " + windChill);
	}
}