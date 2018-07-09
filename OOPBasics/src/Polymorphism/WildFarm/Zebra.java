package Polymorphism.WildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food vegetable) {
if(!(vegetable instanceof  Vegetable)){
    throw new IllegalArgumentException("Zebras are not eating that type of food!");
}
        super.eat(vegetable);
    }

    @Override
    public String makeSound() {
        return "Zs";
    }
}
