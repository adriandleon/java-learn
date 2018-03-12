import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age, please");
		
		int age = input.nextInt();
		
		if (age < 18) {
			System.out.println("You are a teenager");
		}
		else if (age < 40) {
			System.out.println("You are a young");
		}
		else if (age < 65) {
			System.out.println("You are an adult");
		}
		else
		{
			System.out.println("Take care yourself");
		}
	}
}
