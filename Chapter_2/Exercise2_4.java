import java.util.*;
public class Exercise2_4 {
	
	public static void main(String[] args) {
		
		// convert pounds to kiograms
		
		// user input for pounds
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double poundsFromInput = in.nextDouble();
		
		// convert pounds to kilograms
		double poundsToKilograms = poundsFromInput * 0.454;
		
		// display
		System.out.println(poundsFromInput + " pounds is " 
		+ poundsToKilograms + " kilograms");
	}
}