import java.util.Scanner;
public class Exercise2_21 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = in.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double investmentRate = in.nextDouble() / 100;
		System.out.print("Enter number of years: ");
		double numberOfYears =  in.nextDouble();
		
		// formula
		double futureInvestmentValue = investmentAmount 
		* Math.pow((1 + (investmentRate / 12)), numberOfYears * 12);
		
		// display
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	}
}