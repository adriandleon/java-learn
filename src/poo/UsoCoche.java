package poo;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche = new Coche();
		
		micoche.setColor("negro");
		
		System.out.println(micoche.getDatosGenerales());
		
		System.out.println(micoche.getColor());
		
		micoche.setAsientosCuero(true);
		
		System.out.println(micoche.getAsientosCuero());
	}

}
