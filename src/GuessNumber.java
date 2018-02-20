import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int attempts = 0;
		
		do {
			attempts++;
			
			System.out.println("Enter a number, please");
			number = input.nextInt();
			
			if (randomNumber < number) {
				System.out.println("Lower");
			}
			else if (randomNumber > number) {
				System.out.println("Higher");
			}
		} while (number != randomNumber);
		
		input.close();
		
		System.out.println("Correct: " + randomNumber + " = " + number);
		System.out.println("Attempt " + attempts);
	}
}