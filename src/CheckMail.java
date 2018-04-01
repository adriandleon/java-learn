import javax.swing.*;

public class CheckMail {

	public static void main(String[] args) {
		
		int at = 0;
		boolean dot = false;
		String email = JOptionPane.showInputDialog("Enter email");
		
		for (int i=0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				at++;
			}
			
			if (email.charAt(i) == '.') {
				dot = true;
			}
		}
		
		if (at == 1 && dot) {
			System.out.println("It is correct");
		}
		else {
			System.out.println("Invalid email address");
		}
	}
}