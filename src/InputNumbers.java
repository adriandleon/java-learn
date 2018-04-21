import javax.swing.*;

public class InputNumbers {

	public static void main(String[] args) {
		
		double x = 10000.0;
		
		System.out.printf("%1.2f", x / 3);
		
		String number1 = JOptionPane.showInputDialog("Enter a number");
		
		double number2 = Double.parseDouble(number1);
		
		System.out.print("The square root of " + number2 + " is ");
		System.out.printf("%1.2f", Math.sqrt(number2));
	}
}
