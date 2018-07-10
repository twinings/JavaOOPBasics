package InterfacesAndAbstractionLab.Car;

import java.io.Serializable;

public class Seat implements Sellable , Serializable {
    private String countyProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Double price;

    public Seat( String model,String color,Integer horsePower,String countyProduced,Double price) {
        this.countyProduced = countyProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.price=price;
    }

    @Override
    public Double getPrice() {
        return null;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String getColor() {
        return this.color;
    }


    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

      sb.append(String.format("This is %s produced in %s and have %d tires",this.getModel(),this.countyProduced,Car.TIRES));
    return sb.toString();
    }
}
