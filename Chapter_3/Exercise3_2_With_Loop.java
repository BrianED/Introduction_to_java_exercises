import java.util.Scanner;
public class Exercise3_2_With_Loop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Sum up these three numbers: ");
		int n1 = (int)(Math.random() * 9 + 1);
		int n2 = (int)(Math.random() * 9 + 1);
		int n3 = (int)(Math.random() * 9 + 1);
		
		String result = "";
		boolean answer = true;
		
		// three numbers added up needs to equal user input
		int sum = n1 + n2 + n3;
		while(answer) {
			System.out.print(n1+ " + " + n2 + " + " + n3 
			+ "\nEnter your answer: ");
			int userInput= in.nextInt();
			if (sum == userInput) {
				result = "Correct!";
				answer = false;
			} else {
				result = "Incorrect. Try again!";
				//System.out.println(result);
				answer = true;
			}
			System.out.println(result);
		}
	}
}