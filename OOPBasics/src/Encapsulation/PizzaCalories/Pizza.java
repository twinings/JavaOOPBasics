package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfToppings;
    public Pizza(String name,int numberOfToppings){
this.setName(name);
this.setNumberOfToppings(numberOfToppings);
this.toppings=new ArrayList<>();
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (10 < numberOfToppings) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfToppings = numberOfToppings;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() == 0 || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }


    public void addToppings(Topping topping){
        this.toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }
    public double getTotalCalories() {
        return this.getDough().getAllCals() + this.getTotalToppingsCalories();
    }private double getTotalToppingsCalories() {
        return getToppings().stream().mapToDouble(Topping::getCalories).sum();
    }

    public int getNumberOfToppings() {
        int toppings = this.getToppings().size();
        if (10 < toppings) {
            throw new IllegalStateException("Number of toppings should be in range [0..10].");
        }
        return toppings;
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",this.getName(),this.getTotalCalories());
    }
}
