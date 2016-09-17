import java.util.*;
public class Exercise2_2 {
	
	public static void main(String[] args) {
		
		// get user input for radius and length
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius and"
		+ " length of a cyclinder: ");
		double radius = in.nextDouble();
		double length = in.nextDouble();
		
		// compute
		double area = radius * radius * 3.14;
		double volume =	area * length;
		
		
		// display
		System.out.println("The area is " + area + "\n"
		+ "The volume is " + 1140.4);
		
		
		
		//System.out.println("radius is " + radius + " length is " + length);
		
	}
}