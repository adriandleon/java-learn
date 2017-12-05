import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "admin";
		String pass = "";
		
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Enter your password, please");
			
			if (clave.equals(pass) == false) {
				System.out.println("Incorrect password");
			} 
			else {
				System.out.println("Allowed access");
			}
		}
	}
}