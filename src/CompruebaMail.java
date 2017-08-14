import javax.swing.*;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		boolean punto = false;
		String email = JOptionPane.showInputDialog("Introduce email");
		
		for (int i=0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				arroba++;
			}
			
			if (email.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if (arroba == 1 && punto) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("Email no válido");
		}
	}
}