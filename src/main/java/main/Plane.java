package main;

public class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Plane", manufacturer, model, maxSpeed, new Engine("Jet engine", 500));
    }

    public void fly() {
        System.out.println(getManufacturer() + " " + getModel() + " is flying in the sky!");
    }
}
