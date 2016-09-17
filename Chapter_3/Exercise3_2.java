import java.util.Scanner;
public class Exercise3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Sum up these three numbers: ");
		int n1 = (int)(Math.random() * 9 + 1);
		int n2 = (int)(Math.random() * 9 + 1);
		int n3 = (int)(Math.random() * 9 + 1);
		
		String result = "";
		
		// three numbers added up needs to equal user input
		int sum = n1 + n2 + n3;
		System.out.print(n1+ " + " + n2 + " + " + n3 
		+ "\nEnter your answer: ");
		int userInput= in.nextInt();
		//in.close();
		if (sum == userInput) {
			result = "Correct!";
		} else {
			result = "Incorrect. Try again!";
		}
		System.out.println(result);
	}
}