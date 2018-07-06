package poo;

public class Furgoneta extends Vehicle {
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		
		super(); // call the super class constructor
		
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
	}
	
	public String getDatosFurgoneta() {
		return " La capacidad de carga es: " + capacidad_carga + " y las plazas"
				+ " son: " + plazas_extra;
	}

}
