import javax.swing.*;

public class AccessApplication {

	public static void main(String[] args) {

	    String storedPassword = "admin";
		String userPassword = "";
		
		while (!storedPassword.equals(userPassword)) {
			
			userPassword = JOptionPane.showInputDialog("Enter your password, please");
			
			if (!storedPassword.equals(userPassword)) {
				System.out.println("Incorrect password");
			} 
			else {
				System.out.println("Allowed access");
			}
		}
	}
}