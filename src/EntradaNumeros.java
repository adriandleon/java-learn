import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10000.0;
		
		System.out.printf("%1.2f", x / 3);
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
