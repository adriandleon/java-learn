package poo;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle();
		
		car.setColor("White");
		
		Furgoneta van = new Furgoneta(580, 7);
		
		van.setColor("Red");
		
		van.setLeatherSeats(true);
		
		van.setAirConditioner(true);
		
		System.out.println(car.getGeneralData() + " " + car.getColor());
		
		System.out.println(van.getGeneralData() + van.getDatosFurgoneta());
	}
}
