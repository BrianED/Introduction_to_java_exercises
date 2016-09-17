import java.util.*;
public class Exercise2_6 {
	
	public static void main(String[] args) {
		
		// read from input an integer from 0 - 1000
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000:");
		int input = in.nextInt();
		
		// break number into individual parts
		double firstNumber = input % 10;
		double secondNumber = (input % 100) / 10;
		double thirdNumber = (input % 1000) / 100;
		//double fourthNumber = input / 1000;
		double total = firstNumber + secondNumber + thirdNumber;
		System.out.println("The sum of the digits is " + total);
	}
}