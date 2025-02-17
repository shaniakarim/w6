package main;

public class Vehicle {
    private String type;
    private String manufacturer;
    private String model;
    private int maxSpeed;
    private Engine engine;

    public Vehicle(String type, String manufacturer, String model, int maxSpeed, Engine engine) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return type + ": " + manufacturer + " " + model + "\n" +
                "Max Speed: " + maxSpeed + " km/h\n" +
                "Engine: " + engine;
    }
}
