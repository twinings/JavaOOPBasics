package Polymorphism.Vehicles;

public class Car extends Vehicle {
    private static final double CONSUMPTION_AIR=0.9;
    public Car(double fuelQuantity, double litersPerKm,double tankCapacity) {
        super(fuelQuantity, litersPerKm+CONSUMPTION_AIR,tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        if(liters<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(super.getFuelQuantity()+liters>super.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
super.setFuelQuantity(super.getFuelQuantity()+liters);
    }

    public void drive(double distance) {
        double fuelNeeded = distance * super.getLitersPerKm();
        if(super.getFuelQuantity()<fuelNeeded){
            throw new IllegalArgumentException("Car needs refueling");
        }

        super.setFuelQuantity(super.getFuelQuantity()-fuelNeeded);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f",super.getFuelQuantity());
    }
}
