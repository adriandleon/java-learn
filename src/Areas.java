import javax.swing.*;
import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select one option: \n1: Square\n2: Rectangle" +
				"\n3: Triangle\n4: Circle");
		
		int figure = input.nextInt();
		
		input.close();
		
		switch (figure) {
		case 1:
			
			int side = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the side"));

			System.out.println("The area of the square is " + Math.pow(side, 2));
			break;
		
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the base"));
			int height = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the height"));
			
			System.out.println("The area of the rectangle is " + (base * height));
			break;
			
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the base"));
			height = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the height"));
			
			System.out.println("The area of the triangle is " + (base * height) / 2);
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter the radio"));
			
			System.out.print("The area of the circle is ");
			
			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));
			break;
			
		default:
			
			System.out.println("The option is not correct");
			break;
		}
	}
}