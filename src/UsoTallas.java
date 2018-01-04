import java.util.Scanner;

public class UsoTallas {
	
//	enum Talla { SHORT, MEDIUM, LARGE, XLARGE };
	
	enum Talla {
		
		SHORT("S"), MEDIUM("M"), LARGE("L"), XLARGE("XL");
		
		private String abreviatura;
		
		Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una talla (SHORT, MEDIUM, LARGE, XLARGE): ");
		
		String inputData = input.next().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, inputData);
		
		System.out.println("Talla = " + laTalla);
		
		System.out.println("Abreviatura = " + laTalla.getAbreviatura());
		
	}

}
