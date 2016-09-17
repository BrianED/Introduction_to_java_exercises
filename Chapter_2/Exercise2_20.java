import java.util.*;
public class Exercise2_20 {
	public static void main(String[] args) {
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter balance and interest rate: ");
		double balance = in.nextDouble();
		double interestRate = in.nextDouble();
		
		// formula
		double interest = balance * (interestRate / 1200);
		
		// display
		System.out.print("The interest is " + interest);
	}
}