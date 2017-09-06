package poo;

//import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Coche micoche = new Coche();
//		
//		micoche.setColor(JOptionPane.showInputDialog("Introduce color"));
//		
//		System.out.println(micoche.getDatosGenerales());
//		
//		System.out.println(micoche.getColor());
//		
//		boolean asientosOpcion = JOptionPane.showInputDialog("¿Tiene asientos d"
//				+ "e cuero?").equalsIgnoreCase("si");
//		
//		micoche.setAsientosCuero(asientosOpcion);
//		
//		System.out.println(micoche.getAsientosCuero());
//		
//		boolean climatizadorOpcion = JOptionPane.showInputDialog("¿Tiene climat"
//				+ "izador?").equalsIgnoreCase("si");
//		
//		micoche.setClimatizador(climatizadorOpcion);
//		
//		System.out.println(micoche.getClimatizador());
//		
//		System.out.println(micoche.getPesoTotal());
//		
//		System.out.println("El precio final del coche es " + micoche.getPrecioCoche());
		
		Coche car1 = new Coche();
		
		car1.setColor("White");
		
		Furgoneta furgo1 = new Furgoneta(580, 7);
		
		furgo1.setColor("Red");
		
		furgo1.setAsientosCuero(true);
		
		furgo1.setClimatizador(true);
		
		System.out.println(car1.getDatosGenerales() + " " + car1.getColor());
		
		System.out.println(furgo1.getDatosGenerales() + furgo1.getDatosFurgoneta());
		
	}

}
