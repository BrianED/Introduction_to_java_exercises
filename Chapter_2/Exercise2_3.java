import java.util.*;
public class Exercise2_3 {
	
	public static void main(String[] args) {
		
		// take in user input in feet
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double feetFromInput = in.nextDouble();
		
		// convert input to metres
		double feetToMetres = feetFromInput * 0.305;		
		
		// display
		System.out.println(feetFromInput + " feet is " + feetToMetres + " metres");
	}
}