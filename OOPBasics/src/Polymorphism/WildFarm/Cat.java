package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }



    private void setBreed(String breed) {
        this.breed = breed;
    }

    private String getBreed() {
        return breed;
    }

    @Override
    public void eat(Food food) {

        super.eat(food);
    }

    @Override
    public String makeSound() {
      return "Meowwww";
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",super.getAnimalType(),super.getAnimalName(),this.getBreed(),new DecimalFormat("#.##").format(super.getAnimalWeight()),super.getLivingRegion(),super.getFoodEaten());

    }
}
