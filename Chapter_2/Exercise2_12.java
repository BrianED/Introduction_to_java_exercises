import java.util.*;
public class Exercise2_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		double speed = in.nextDouble();
		double acceleration = in.nextDouble();
		
		// compute
		double length = (Math.pow(speed,2)) / (2 * acceleration);
		
		// display
		System.out.println("The minimum runway length for this airplane"
		+ " is " + length);
	}
}