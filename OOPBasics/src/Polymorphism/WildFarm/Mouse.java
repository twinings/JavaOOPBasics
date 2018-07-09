package Polymorphism.WildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if(!(food instanceof  Vegetable)){
            throw new IllegalArgumentException("Mouse don't eat that type of food!");
        }
        super.eat(food);
    }

    @Override
    public String makeSound() {
       return "SQUEEEAAAK!" ;
    }


}
