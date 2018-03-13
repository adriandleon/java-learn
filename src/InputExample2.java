import javax.swing.*;

public class InputExample2 {

	public static void main(String[] args) {
		
		String userName = JOptionPane.showInputDialog("Enter your name, please");
		
		String age = JOptionPane.showInputDialog("Enter your age, please");
		
		int userAge = Integer.parseInt(age);
		
		System.out.println("Hello " + userName + ". Next year you'll have " +
				(userAge + 1) + " years old");
	}
}
