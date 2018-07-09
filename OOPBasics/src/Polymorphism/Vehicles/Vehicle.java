package Polymorphism.Vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double litersPerKm;
private double tankCapacity;

    protected Vehicle(double fuelQuantity, double litersPerKm,double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitersPerKm(litersPerKm);
        this.setTankCapacity(tankCapacity);
    }

    private void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    protected double getTankCapacity(){
        return tankCapacity;
    }

    protected void setFuelQuantity(double fuelQuantity) {

        this.fuelQuantity = fuelQuantity;
    }

    protected final double getFuelQuantity() {
        return fuelQuantity;
    }

    protected double getLitersPerKm() {
        return litersPerKm;
    }


    private void setLitersPerKm(double litersPerKm) {

        this.litersPerKm = litersPerKm;
    }
    public abstract   void drive(double distance);
public abstract  void  refuel(double liters);
protected  void driveEmpty(double litersPerKm){

}

}
