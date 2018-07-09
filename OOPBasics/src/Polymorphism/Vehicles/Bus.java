package Polymorphism.Vehicles;

public class Bus extends Vehicle{
    private static final double AIR_CONDITIONER = 1.4;
    public Bus(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * (super.getLitersPerKm()+AIR_CONDITIONER);
if(super.getFuelQuantity()<fuelNeeded){
    throw new IllegalArgumentException("Bus needs refueling");
}
super.setFuelQuantity(super.getFuelQuantity()-fuelNeeded);
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

     protected void  driveEmpty(double distance){
        double fuelNeeded = distance * super.getLitersPerKm();
        if(super.getFuelQuantity()<fuelNeeded){
            throw new IllegalArgumentException("Bus needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity()-fuelNeeded);
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f",super.getFuelQuantity());
    }
}
