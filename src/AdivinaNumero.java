import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random() * 100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, intentos = 0;
		
		do {
			intentos++;
			
			System.out.println("Introudce un número, por favor");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("Más bajo");
			}
			else if (aleatorio > numero) {
				System.out.println("Más alto");
			}
		} while (numero != aleatorio);
		
		entrada.close();
		
		System.out.println("Correcto: " + aleatorio + " = " + numero);
		System.out.println("Intentos " + intentos);
		
	}

}