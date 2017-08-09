import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu " +
			"nombre por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por " +
			"favor");
		
		int edadUsuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene " +
				"tendrás " + (edadUsuario + 1) + " años");
	}

}
