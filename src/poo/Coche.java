package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	String color;
	int pesoTotal;
	boolean asientosCuero, climatizador;
	
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
	
	public void setColor() { // Setter method
		color = "azul";
	}
	
	public String getColor() {
		return "El color del coche es " + color;
	}
}
