import javax.swing.*;

public class IdealWeight {

	public static void main(String[] args) {
		
		String gender;
		
		do {
		    gender = JOptionPane.showInputDialog("Enter your gender (M/F)");
			
		} while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"));
		
		int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in centimeters"));
		
		int idealWeight = 0;
		
		if (gender.equalsIgnoreCase("M")) {
			idealWeight = height - 110;
		}
		else if (gender.equalsIgnoreCase("F" )) {
			idealWeight = height - 120;
		}
		
		System.out.println("Your ideal weight is " + idealWeight + " Kg");
	}
}
