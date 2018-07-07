package Encapsulation.PizzaCalories;

public class Topping {
    private static final Double DEFAULT_DOUGH_MODIFIER = 2.0;
    private String name;
    private double weight;
    public Topping(String name,double weight){
        this.setName(name);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if(weight<1 || weight>50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.getName()));
        }
        this.weight = weight;
    }

    private void setName(String name) {
        if(name==null || (!"meat".equalsIgnoreCase(name) && !"veggies".equalsIgnoreCase(name) && !"cheese".equalsIgnoreCase(name) && !"sauce".equalsIgnoreCase(name))){
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",name));
        }
        this.name = name;
    }

    private double getWeight() {
        return weight;
    }

    private String getName() {
        return name;
    }
    public Double getCalories(){
        return DEFAULT_DOUGH_MODIFIER*this.getWeight()*this.getModifier();
    }
    private Double getModifier(){
        String type = this.getName().toLowerCase();
        switch (type){
            case "meat":
                return 1.2;
            case "veggies":
                return 0.8;
            case "cheese":
                return 1.1;
            case "sauce":
                return 0.9;
            default:
                return null;
        }
    }
}
