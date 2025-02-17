package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "1) Create new vehicle, 2) List vehicles, 3) Drive cars, 4) Fly planes, 5) Sail the ships, 0) End the program");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                System.out.println("Thank you for using the program.");
                break;
            }

            switch (choice) {
                case 1:
                    createVehicle();
                    break;
                case 2:
                    listVehicles();
                    break;
                case 3:
                    moveVehicles(Car.class);
                    break;
                case 4:
                    moveVehicles(Plane.class);
                    break;
                case 5:
                    moveVehicles(Ship.class);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void createVehicle() {
        System.out.println("Which vehicle do you want to build? 1) car, 2) plane, 3) ship");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.println("Who is the manufacturer?");
        String manufacturer = scanner.nextLine();

        System.out.println("What is the model of the vehicle?");
        String model = scanner.nextLine();

        System.out.println("What is the top speed?");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case 1:
                vehicles.add(new Car(manufacturer, model, maxSpeed));
                break;
            case 2:
                vehicles.add(new Plane(manufacturer, model, maxSpeed));
                break;
            case 3:
                vehicles.add(new Ship(manufacturer, model, maxSpeed));
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }

    private static void listVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                Vehicle v = vehicles.get(i);
                System.out.println(v.getType() + ": " + v.getManufacturer() + " " + v.getModel());
                System.out.println("Max Speed: " + v.getMaxSpeed() + " km/h");
                System.out.println("Engine: " + v.getEngine().getName() + " (" + v.getEngine().getPower() + " HP) ");

                if (i < vehicles.size() - 1) {
                    System.out.println();
                }
            }
        }
    }

    private static void moveVehicles(Class<?> type) {
        for (Vehicle v : vehicles) {
            if (type.isInstance(v)) {
                if (v instanceof Car) {
                    ((Car) v).drive();
                } else if (v instanceof Plane) {
                    ((Plane) v).fly();
                } else if (v instanceof Ship) {
                    ((Ship) v).sail();
                }
            }
        }
    }
}
