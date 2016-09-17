import java.util.*;
public class Exercise2_13 {
	
	public static void main(String[] args) {
		
		// take user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = in.nextDouble();
		
		// compute monthly interest
		double interestRate = (1 + 0.00417);
		double firstMonth = savingAmount * interestRate;
		double secondMonth = (firstMonth + savingAmount) * interestRate;
		double thirdMonth = (secondMonth + savingAmount) * interestRate;
		double fourthMonth = (thirdMonth + savingAmount) * interestRate;
		double fifthMonth = (fourthMonth + savingAmount) * interestRate;
		double sixthMonth = (fifthMonth + savingAmount) * interestRate;
		
		// display results
		System.out.println("After the sixth month, the account value"
		+ " is $" + sixthMonth);
		System.out.printf("After the sixth month, the account value"
		+ " is $%.2f (To two decimal places)\n", sixthMonth);
	}
}