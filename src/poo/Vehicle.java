package poo;

public class Vehicle {

    private int wheels;
    private int length;
    private int width;
    private int engine;
    private int platformWeight;
    private int totalWeight;
    private String color;
    private boolean leatherSeats;
    private boolean airConditioner;

    // Constructor
    Vehicle() {
        this.wheels = 4;
        this.length = 2000;
        this.width = 800;
        engine = 1600;
        platformWeight = 500;
    }

    public int getWheels() {
        return wheels;
    }

    public String getLength() { // Getter method
        return "The length of the vehicle is " + length;
    }

    void setColor(String _color) { // Setter method
        color = _color;
    }

    String getColor() {
        return "The color of the vehicle is " + color;
    }

    String getGeneralData() {

        return "The platform of the vehicle has " + wheels + " wheels. It is " +
                length / 1000 + " meters long, " + width + " centimeters wide and weighs " +
                platformWeight + "kilos.";
    }

    void setLeatherSeats(boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public String getLeatherSeats() {

        if (leatherSeats) {
            return "The vehicle has leather seats";
        } else {
            return "The vehicle has normal seats";
        }
    }

    void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public String getAirConditioner() {

        if (airConditioner) {
            return "The vehicle has air conditioner";
        } else {
            return "The vehicle does not have air conditioner";
        }
    }

    public String getTotalWeight() { // Setter and Getter

        int bodyWeight = 500;

        totalWeight = platformWeight + bodyWeight;

        if (leatherSeats) {
            totalWeight += 50;
        }

        if (airConditioner) {
            totalWeight += 20;
        }

        return "The total weight of the car is " + totalWeight;
    }

    public int getVehiclePrice() { // Getter

        int finalPrice = 10000;

        if (leatherSeats) {
            finalPrice += 2000;
        }

        if (airConditioner) {
            finalPrice += 1500;
        }

        return finalPrice;
    }
}
