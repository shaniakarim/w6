package main;

public class Ship extends Vehicle {
    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Ship", manufacturer, model, maxSpeed, new Engine("Wärtsilä Super", 1000));
    }

    public void sail() {
        System.out.println(getManufacturer() + " " + getModel() + " is sailing on the sea!");
    }
}
