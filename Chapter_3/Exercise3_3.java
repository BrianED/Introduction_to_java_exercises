import java.util.Scanner;
public class Exercise3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		String result = "";
		
		// if its zero then end
		double equation = (a * d) - (b * c);
		if (equation == 0) {
			result = "The equation has no solution.";
		} else {
			double x = (e * d - b * f) / equation;
			double y = (a * f - e * c) / equation;
			result = "x = " + x + " and y = " + y;
		}
		System.out.println(result);
	}
}