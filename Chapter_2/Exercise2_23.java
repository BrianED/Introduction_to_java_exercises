import java.util.Scanner;
public class Exercise2_23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double drivingDistance = in.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = in.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = in.nextDouble();
		
		// formula
		double mpg = drivingDistance / milesPerGallon;
		double price = mpg * pricePerGallon;
		
		
		
		
		System.out.print("The cost of driving is $" + price);
	}
}