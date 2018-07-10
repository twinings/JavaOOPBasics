package InterfacesAndAbstractionLab.Car;

public class Audi implements Rentable{
    private String countyProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Double pricePerDay;
    private Integer minRentDays;

    public Audi(String model, String color, Integer horsePower, String countyProduced,Integer minRentDays, Double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countyProduced=countyProduced;
        this.pricePerDay = pricePerDay;
        this.minRentDays = minRentDays;
    }

    public String getCountyProduced() {
        return countyProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    public Integer getMinRentDays() {
        return this.minRentDays;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("This is %s produced in %s and have %d tires",this.getModel(),this.countyProduced,Car.TIRES)).append(System.lineSeparator());
        return sb.toString();
    }

}
