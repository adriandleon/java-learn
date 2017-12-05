import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random() * 100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, intentos = 0;
		
		do {
			intentos++;
			
			System.out.println("Enter a number, please");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("Lower");
			}
			else if (aleatorio > numero) {
				System.out.println("Higher");
			}
		} while (numero != aleatorio);
		
		entrada.close();
		
		System.out.println("Correct: " + aleatorio + " = " + numero);
		System.out.println("Attempt " + intentos);
		
	}

}