import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "admin";
		String pass = "";
		
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introudce la contrase�a, por favor");
			
			if (clave.equals(pass) == false) {
				System.out.println("Contrase�a incorrecta");
			} 
			else {
				System.out.println("Acceso permitido");
			}
		}
	}
}