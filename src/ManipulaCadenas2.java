
public class ManipulaCadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Hoy es un estupendo día para aprender a programar " +
		"en Java";
		
		String frase_resumen = frase.substring(0, 28) + " irnos a la playa, " +
		"olvidarnos de todo y " + frase.substring(29, 57);
		
		System.out.println(frase_resumen);
	}

}
