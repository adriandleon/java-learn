import java.util.Scanner;

public class InputExample1 {

	public static void main(String[] args) {
		
		String userName;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name, please");
		
		userName = input.nextLine();
		
		System.out.println("Enter your age, please");
		
		int age = input.nextInt();
		
		input.close();
		
		System.out.println("Hello " + userName + ". Next year you'll " +
		"have " + (age + 1) + " years old.");
	}
}
