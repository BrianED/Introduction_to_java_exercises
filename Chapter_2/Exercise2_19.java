import java.util.*;
public class Exercise2_19 {
	public static void main(String[] args) {
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		// calculate sides
		double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2),0.5);
		double side2 = Math.pow((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3),0.5);
		double side3 = Math.pow((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1),0.5);
		
		// formula
		double s = ((side1 + side2 + side3) / 2);
		double area = Math.pow(s * ((s - side1) * (s - side2) * (s - side3)),0.5);
		
		// display results
		System.out.println("The area o the triangle is " + area);
	}
}