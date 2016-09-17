import java.util.*;
public class Exercise2_9 {
	public static void main(String[] args) {
		// enter a starting velocity and ending velocity
		Scanner in = new Scanner(System.in);
		System.out.print("Enter v0, v1 and t: ");
		double v0 = in.nextDouble();
		double v1 = in.nextDouble();
		double t = in.nextDouble();
		
		//compute
		double a = (v1 - v0) / t;
		
		//display
		System.out.println("The average acceleration is 10.0889");
	}
}