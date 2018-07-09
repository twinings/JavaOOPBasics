package Polymorphism.Vehicles;

public class Truck extends Vehicle{
    private static final double AIR_CONSUMPTION = 1.6;
    private static final double REFUEL_LEAK = 0.95;
    public Truck(double fuelQuantity, double litersPerKm,double tankCapacity) {
        super(fuelQuantity, litersPerKm+AIR_CONSUMPTION,tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        if(liters<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(super.getFuelQuantity()+(liters*REFUEL_LEAK)>super.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
super.setFuelQuantity(super.getFuelQuantity()+liters*REFUEL_LEAK);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * super.getLitersPerKm();
        if(super.getFuelQuantity()<fuelNeeded){
            throw new IllegalArgumentException("Truck needs refueling");
        }

        this.setFuelQuantity(super.getFuelQuantity()-fuelNeeded);
    }
    @Override
    public String toString() {
        return String.format("Truck: %.2f",super.getFuelQuantity());
    }

}
