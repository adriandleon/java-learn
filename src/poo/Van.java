package poo;

class Van extends Vehicle {
	
	private int loadCapacity;
	private int extraSeats;
	
	Van(int loadCapacity, int extraSeats) {
		
		super(); // call the super class constructor
		
		this.loadCapacity = loadCapacity;
		this.extraSeats = extraSeats;
	}
	
	String getDataVan() {
		return "The load capacity is: " + loadCapacity + " and " + extraSeats + " extra seats.";
	}
}
