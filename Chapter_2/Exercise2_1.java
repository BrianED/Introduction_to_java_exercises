import java.util.*;
public class Exercise2_1 {
	
	public static void main(String[] args) {
		
		// take input from user in double
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		double userInputInCelsius = in.nextDouble();
		
		// convert user input to fahrenheit
		double celsiusToFahrenheit = (9.0 / 5) * userInputInCelsius + 32;
		
		// display results
		System.out.println(userInputInCelsius + 
		" Celsius is " + celsiusToFahrenheit + " Fahrenheit");
	}
}