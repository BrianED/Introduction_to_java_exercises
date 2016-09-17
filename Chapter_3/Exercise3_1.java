import java.util.Scanner;
public class Exercise3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		String result = "";
		
		// check the discriminant for root type
		// if discriminant is positive the equation has 2 real roots
		// if it is zero the equation has 1 root
		// if it is negative it has 0 real roots
		double discriminant = (b * b) - 4 * a * c;
		
		// compute -b formula with discriminant variable in its place
		if (discriminant > 0) {
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			result = "The equation has two roots " + r1 + " and " + r2;
		} else if (discriminant == 0) {
			double r1 = -b / (2 * a);
			result = "The equation has one root " + r1;
		} else
			result = "The equation has no real roots";
		
		// display
		System.out.println(result);
	}
}