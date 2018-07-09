package Polymorphism.WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        Animal animal = null;
        Food food = null;
        while (true) {
            String line = reader.readLine();
            if ("end".equalsIgnoreCase(line)) {
                break;
            }
            if (counter % 2 == 0) {
                String[] animalArgs = line.split("\\s+");
                switch (animalArgs[0].toLowerCase()) {

                    case "cat":
                        animal = new Cat(animalArgs[1], animalArgs[0], Double.parseDouble(animalArgs[2]), animalArgs[3], animalArgs[4]);

                        break;
                    case "tiger":
                        animal = new Tiger(animalArgs[1], animalArgs[0], Double.parseDouble(animalArgs[2]), animalArgs[3]);

                        break;
                    case "zebra":
                        animal = new Zebra(animalArgs[1], animalArgs[0], Double.parseDouble(animalArgs[2]), animalArgs[3]);
                        break;
                    case "mouse":
                        animal = new Mouse(animalArgs[1], animalArgs[0], Double.parseDouble(animalArgs[2]), animalArgs[3]);
                        break;
                        default:
                            throw new IllegalArgumentException("Invalid animal type!");
                }
                System.out.println(animal.makeSound());
            } else {
                String[] foodArgs = line.split(" ");
                if ("Vegetable".equalsIgnoreCase(foodArgs[0])) {
                    food = new Vegetable(Integer.parseInt(foodArgs[1]));
                } else if ("meat".equalsIgnoreCase(foodArgs[0])) {
                    food = new Meat(Integer.parseInt(foodArgs[1]));
                } else {
                    throw new IllegalArgumentException("Invalid food type!");
                }
                try {
                    animal.eat(food);
                } catch (IllegalArgumentException iea) {
                    System.out.println(iea.getMessage());
                }


            }
            counter++;
        }
            System.out.println(animal);


    }
}

