
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Juan";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " carácteres");
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		
		int ultima_letra = nombre.length();
			
		System.out.println("La última letra es " + nombre.charAt(ultima_letra-1));
		
	}

}
