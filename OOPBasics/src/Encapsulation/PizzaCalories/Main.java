package Encapsulation.PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] pizzaLine = reader.readLine().split(" ");
            Pizza pizza = new Pizza(pizzaLine[1],Integer.parseInt(pizzaLine[2]));
            String[] doughLine = reader.readLine().split(" ");
Dough dough = new Dough(doughLine[1],doughLine[2],Double.parseDouble(doughLine[3]));
pizza.setDough(dough);
            while (true) {
                String line = reader.readLine();
                if ("END".equalsIgnoreCase(line)) {
                    break;
                }
                String[] toppingElements = line.trim().split(" ");
                Topping topping = new Topping(toppingElements[1],Double.parseDouble(toppingElements[2]));
pizza.addToppings(topping);
            }
            System.out.println(pizza.toString());
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
