import javax.swing.*;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba = false;
		String email = JOptionPane.showInputDialog("Introduce email");
		
		for (int i=0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				arroba = true;
			}
		}
		
		if (arroba) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("Email no válido");
		}
	}

}
