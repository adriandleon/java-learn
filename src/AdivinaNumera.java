import java.util.*;

public class AdivinaNumera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random() * 100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, intentos = 0;
		
		while (numero != aleatorio) {
			intentos++;
			
			System.out.println("Introudce un n�mero, por favor");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("M�s bajo");
			}
			else if (aleatorio > numero) {
				System.out.println("M�s alto");
			}
		}
		
		entrada.close();
		
		System.out.println("Correcto: " + aleatorio + " = " + numero);
		System.out.println("Intentos " + intentos);
		
	}

}