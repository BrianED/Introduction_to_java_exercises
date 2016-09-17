import java.util.*;
public class Exercise2_15 {
	
	public static void main(String[] args) {
		
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		// formula
		double a = (Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2));
		double distanceBetween = Math.pow(a,0.5);
		
		//display results
		System.out.println("The distance between"
		+ " the two points is " + distanceBetween);
	}
}