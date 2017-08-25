package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	// Método constructor
	public Coche() {
		this.ruedas = 4;
		this.largo = 2000;
		this.ancho = 800;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	public int getRuedas() {
		return ruedas;
	}
	
	public String getLargo() { // Getter method
		return "El largo del coche es " + largo;
	}
	
	public void setColor(String _color) { // Setter method
		color = _color;
	}
	
	public String getColor() {
		return "El color del coche es " + color;
	}
	
	public String getDatosGenerales() {
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. Mide " +
				largo/1000 + " metros de largo con un ancho de " + ancho + " ce"
				+ "ntímetros y un peso de plataforma de " + pesoPlataforma + " "
				+ "kilos.";
	}
	
	public void setAsientosCuero(boolean asientosCuero) {
		this.asientosCuero = asientosCuero;
	}
	
	public String getAsientosCuero() {
		if (asientosCuero) {
			return "El coche tiene asientos de cuero";
		}
		else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}
	
	public String getClimatizador() {
		if (climatizador) {
			return "El coche incorpora climatizador";
		}
		else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	public String getPesoTotal() { // Setter and Getter
		int pesoCarroceria = 500;
		
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if (asientosCuero) {
			pesoTotal += 50;
		}
		
		if (climatizador) {
			pesoTotal += 20;
		}
		
		return "El peso total del coche es " + pesoTotal;
	}
	
	public int getPrecioCoche() { // Getter
		int precioFinal = 10000;
		
		if (asientosCuero) {
			precioFinal += 2000;
		}
		
		if (climatizador) {
			precioFinal += 1500;
		}
		
		return precioFinal;
	}
}
