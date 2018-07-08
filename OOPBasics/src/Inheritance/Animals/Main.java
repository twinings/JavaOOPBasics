package Inheritance.Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
while (true){
    String animalType = reader.readLine();
    if("Beast!".equalsIgnoreCase(animalType)){
        break;
    }
    String[] animalArgs = reader.readLine().split(" ");
    try{
        Animal animal =null;
        switch (animalType.toLowerCase()){
            case "frog":
                animal = new Frog(animalArgs[0],Integer.parseInt(animalArgs[1]),animalArgs[2]);
                break;
            case "cat":
                animal=new Cat(animalArgs[0],Integer.parseInt(animalArgs[1]),animalArgs[2]);
                break;
            case "dog":
                animal=new Dog(animalArgs[0],Integer.parseInt(animalArgs[1]),animalArgs[2]);
                break;
            case "tomcat":
                animal=new Tomcat(animalArgs[0],Integer.parseInt(animalArgs[1]));
                break;
            case "kitten":
                animal = new Kitten(animalArgs[0],Integer.parseInt(animalArgs[1]));
                break;
                default:
                    throw new IllegalArgumentException("Invalid input!");

        }
        System.out.println(animal);
        System.out.println(animal.produceSound());
    }catch (IllegalArgumentException iae){
        System.out.println(iae.getMessage());
    }
}

    }
}
