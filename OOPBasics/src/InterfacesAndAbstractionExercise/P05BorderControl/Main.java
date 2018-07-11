package InterfacesAndAbstractionExercise.P05BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identifiable> collect = new ArrayList<>();
        Identifiable entity= null;
        while (true){
            String line = reader.readLine();
            if("End".equalsIgnoreCase(line)){
                break;
            }
            String[] arguments = line.split(" ");
            if(arguments.length==2){
                entity= new Robot(arguments[0],arguments[1]);
            }else if(arguments.length==3){
                entity=new Citizen(arguments[0],Integer.parseInt(arguments[1]),arguments[2]);
            }
            if(entity != null){
                collect.add(entity);
            }
        }
        String endId = reader.readLine();
for(Identifiable element :  collect){
    if(element.getId().substring(element.getId().length()-endId.length(),element.getId().length()).equals(endId)){
        System.out.println(element.getId());
    }
}
    }
}
