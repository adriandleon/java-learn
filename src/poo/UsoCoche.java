package poo;

import javax.swing.*;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche = new Coche();
		
		micoche.setColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.getDatosGenerales());
		
		System.out.println(micoche.getColor());
		
		boolean asientosOpcion = JOptionPane.showInputDialog("¿Tiene asientos d"
				+ "e cuero?").equalsIgnoreCase("si");
		
		micoche.setAsientosCuero(asientosOpcion);
		
		System.out.println(micoche.getAsientosCuero());
		
		boolean climatizadorOpcion = JOptionPane.showInputDialog("¿Tiene climat"
				+ "izador?").equalsIgnoreCase("si");
		
		micoche.setClimatizador(climatizadorOpcion);
		
		System.out.println(micoche.getClimatizador());
		
		System.out.println(micoche.getPesoTotal());
		
		System.out.println("El precio final del coche es " + micoche.getPrecioCoche());
		
	}

}
