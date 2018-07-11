package InterfacesAndAbstractionExercise.P07FoodShortage;

import InterfacesAndAbstractionExercise.P06BirthdayCelebrations.Birthdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Buyer> names = new HashMap<>();
Buyer buyer= null;
int num = Integer.parseInt(reader.readLine());
for(int i =0;i<num;i++){
    String[] line = reader.readLine().split(" ");
    if(line.length==3){
buyer = new Rebel(line[0],Integer.parseInt(line[1]),line[2]);
    }else if(line.length==4){
buyer=new Citizen(line[0],Integer.parseInt(line[1]),line[2],line[3]);
    }
    if(buyer != null && !names.containsKey(line[0])){
        names.put(line[0],buyer);
    }
}
while (true){
    String currentBuyer = reader.readLine();
    if("end".equalsIgnoreCase(currentBuyer)){
        break;
    }
    if(names.containsKey(currentBuyer)){
        names.get(currentBuyer).buyFood();
    }
}
int foodBought = names.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(foodBought);

    }
}
