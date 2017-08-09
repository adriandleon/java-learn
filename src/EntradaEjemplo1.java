import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreUsuario;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene " +
		"tendrás " + (edad + 1) + " años.");
		
	}

}
