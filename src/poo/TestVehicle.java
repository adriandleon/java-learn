package poo;

public class TestVehicle {

    public static void main(String[] args) {

        Vehicle car = new Vehicle();

        car.setColor("White");

        Van van = new Van(580, 7);

        van.setColor("Red");

        van.setLeatherSeats(true);

        van.setAirConditioner(true);

        System.out.println(car.getGeneralData() + " " + car.getColor());

        System.out.println(van.getGeneralData() + van.getDataVan());
    }
}
