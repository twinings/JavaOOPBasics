package Encapsulation.ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String ,Person> persons = new HashMap<>();
        Map<String , Product> productMap = new HashMap<>();
        String[] people = reader.readLine().split(";");
        for (String person : people){
            String[] arguments = person.split("=");
            String name = arguments[0];
            int money = Integer.parseInt(arguments[1]);
            try{
Person currentPerson = new Person(name,money);
persons.putIfAbsent(name,currentPerson);

            }catch (IllegalArgumentException ee){
                System.out.println(ee.getMessage());
                return;
            }
        }

String[] getProducts = reader.readLine().split(";");
        for(String productArgs : getProducts){
            String[] getArgs = productArgs.split("=");
            String productName = getArgs[0];
            int productCost = Integer.parseInt(getArgs[1]);
            try{
                Product product = new Product(productName,productCost);
                productMap.putIfAbsent(productName,product);
            }catch (IllegalArgumentException exp){
                System.out.println(exp.getMessage());
                return;
            }
        }
while (true){
            String line = reader.readLine();
            if("END".equals(line)){
                break;
            }
            String[] arguments = line.split(" ");
            String personName = arguments[0];
            String productName = arguments[1];
            Person person = persons.get(personName);
            Product  product =productMap.get(productName);
            try{
                persons.get(personName).tryaddProduct(productMap.get(arguments[1]));
                System.out.println(String.format("%s bought %s",personName,productName));
            }catch (IllegalArgumentException exp){
                System.out.println(exp.getMessage());
            }
}
persons.values().forEach(System.out::println);
    }
}
