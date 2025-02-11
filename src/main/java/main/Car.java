package main;

public class Car extends Vehicle {
    public Car(String manufacturer, String model, int maxSpeed) {
        super("Car", manufacturer, model, maxSpeed, new Engine("V8", 300));
    }

    public void drive() {
        System.out.println(getManufacturer() + " " + getModel() + " is driving on the road!");
    }
}
