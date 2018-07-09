package Polymorphism.WildFarm;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food meat) {
        if(!(meat instanceof Meat)){
throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
super.eat(meat);
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }
}
