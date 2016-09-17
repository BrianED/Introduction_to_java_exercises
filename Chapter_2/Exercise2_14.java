import java.util.Scanner;
public class Exercise2_14 {
	public static void main(String[] args) {
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = in.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInInches = in.nextDouble();
		
		// conversions
		double poundsToKg = weightInPounds * 0.45359237;
		double inchesToMetres = heightInInches * 0.0254;
		
		// calculation
		double result = poundsToKg / (inchesToMetres * inchesToMetres);
		
		// display
		System.out.println("BMI is " + result);
		
	}
}