package Polymorphism.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] carArguments = reader.readLine().split(" ");
        String[] truckArguments = reader.readLine().split(" ");
        String[] busArguments = reader.readLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carArguments[1]), Double.parseDouble(carArguments[2]),Double.parseDouble(carArguments[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckArguments[1]), Double.parseDouble(truckArguments[2]),Double.parseDouble(truckArguments[3]));
        Vehicle bus = new Bus(Double.parseDouble(busArguments[1]), Double.parseDouble(busArguments[2]),Double.parseDouble(busArguments[3]));
        int numberOfCommands = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfCommands; i++) {
            String[] current = reader.readLine().split(" ");
            if ("drive".equalsIgnoreCase(current[0])) {
                double distance = Double.parseDouble(current[2]);
                if ("car".equalsIgnoreCase(current[1])) {
                    try {
                        car.drive(distance);
                        System.out.printf("Car travelled %s km\n", new DecimalFormat("#.##").format(distance));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if ("truck".equalsIgnoreCase(current[1])) {
                    try {
                        truck.drive(distance);
                        System.out.printf("Truck travelled %s km\n",new DecimalFormat("#.##").format(distance));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
                else if ("bus".equalsIgnoreCase(current[1])) {
                    try {
                        bus.drive(distance);
                        System.out.printf("Bus travelled %s km\n",new DecimalFormat("#.##").format(distance));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
            } else if ("refuel".equalsIgnoreCase(current[0])) {
                double amount = Double.parseDouble(current[2]);
                if ("car".equalsIgnoreCase(current[1])) {
                    try {
                        car.refuel(amount);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if ("truck".equalsIgnoreCase(current[1])) {
                    try {
                        truck.refuel(amount);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
                else if ("bus".equalsIgnoreCase(current[1])) {
                    try {
                        bus.refuel(amount);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
            }
            else if("driveempty".equalsIgnoreCase(current[0])){
                try {
                    bus.driveEmpty(Double.parseDouble(current[2]));
                    System.out.printf("Bus travelled %s km\n",new DecimalFormat("#.##").format(Double.parseDouble(current[2])));
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}