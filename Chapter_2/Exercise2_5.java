import java.util.*;
public class Exercise2_5 {
	
	public static void main(String[] args) {		
		
		// input of subtotal and gratuity rate
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the subtotal and gratuity rate: ");
		double subtotalFromInput = in.nextDouble();
		double gratuityRateFromInput = in.nextDouble();
		
		// compute the gratuity rate
		double gratuityRate2 = gratuityRateFromInput * subtotalFromInput / 100.0;
		double gratuity = subtotalFromInput + gratuityRate2;
		
		// display
		System.out.println("The gratuity is $" + gratuityRate2 
		+ " and total is $" + gratuity);
	}
}