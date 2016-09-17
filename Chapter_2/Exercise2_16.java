import java.util.*;
public class Exercise2_16 {
	
	public static void main(String[] args) {
		
		// input from user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double hex = in.nextDouble();
		
		// formula
		double area = (3 * (Math.pow(3,0.5)) / 2) * Math.pow(hex,2);
		
		// display reslt
		System.out.println("The area of the hexagon is " + area);
	}
}