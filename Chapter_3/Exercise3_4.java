import java.util.Scanner;
public class Exercise3_4 {
	public static void main(String[] args) {
		// generate random number from 1 to 12
		int month = (int)(Math.random() * 11 + 1);
		String numberToMonth = "";
		
		// take random number and assign it a month
		switch (month) {
			case 1: numberToMonth = "January"; break;
			case 2: numberToMonth = "Feb"; break;
			case 3: numberToMonth = "Mar"; break;
			case 4: numberToMonth = "April"; break;
			case 5: numberToMonth = "May"; break;
			case 6: numberToMonth = "June"; break;
			case 7: numberToMonth = "July"; break;
			case 8: numberToMonth = "Aug"; break;
			case 9: numberToMonth = "Sept"; break;
			case 10: numberToMonth = "Oct"; break;
			case 11: numberToMonth = "Nov"; break;
			case 12: numberToMonth = "Dec"; break;
			default: numberToMonth = "Invalid";
		}
		System.out.println("random number is: "
		+ month + " and this is the month of: " + numberToMonth);
	}
}