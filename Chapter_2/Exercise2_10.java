import java.util.*;
public class Exercise2_10 {
	public static void main(String[] args) {
		// get inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount of water in kg: ");
		double waterInKg = in.nextDouble();
		System.out.print("Enter the intial temp: ");
		double initialTemp = in.nextDouble();
		System.out.print("Enter the final temp: ");
		double finalTemp = in.nextDouble();
		
		// calulation
		double energyNeeded = waterInKg * (finalTemp - initialTemp) * 4184;
		
		// display result
		System.out.println("The energy needed is " + energyNeeded);
	}
}