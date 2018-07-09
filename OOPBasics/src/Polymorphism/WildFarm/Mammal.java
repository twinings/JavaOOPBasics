package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.setLivingRegion(livingRegion);
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity()+super.getFoodEaten());
    }

    @Override
    public String toString() {

        return String.format("%s[%s, %s, %s, %d]",super.getAnimalType(),super.getAnimalName(),new DecimalFormat("#.##").format(super.getAnimalWeight()),this.getLivingRegion(),super.getFoodEaten());
    }
}