package InterfacesAndAbstractionExercise.P08MilitaryElite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Map<String,ISoldier> soldierMap = new LinkedHashMap<>();
        Map<String,IPrivate> privateMap =new HashMap<>();
while (true){
    String[] commandArgs = reader.readLine().split("\\s");
    ISoldier soldier= null;
    if("end".equalsIgnoreCase(commandArgs[0])){
        break;
    }
    switch (commandArgs[0].toLowerCase()) {
        case "private":
            Private soldierr = new Private(commandArgs[1], commandArgs[2], commandArgs[3], Double.parseDouble(commandArgs[4]));
            soldierMap.put(commandArgs[1], soldierr);
            privateMap.put(commandArgs[1], soldierr);
            break;
        case "leutenantgeneral":
            List<IPrivate> privates = new ArrayList<>();
            for (int i = 5; i < commandArgs.length; i++) {
                privates.add(privateMap.get(commandArgs[i]));
            }
            soldier = new LeutenantGeneral(commandArgs[1], commandArgs[2], commandArgs[3], Double.parseDouble(commandArgs[4]), privates);
            break;
        case "engineer":
            try {
                List<IRepairs> repairs = new ArrayList<>();
                for (int i = 6; i < commandArgs.length; i += 2) {
                    IRepairs repair = new Repair(commandArgs[i], Integer.parseInt(commandArgs[i + 1]));
                    repairs.add(repair);
                }
                soldier = new Engineer(commandArgs[1], commandArgs[2], commandArgs[3], Double.parseDouble(commandArgs[4]), commandArgs[5], repairs);
            } catch (IllegalArgumentException ee) {
                ;
            }
            break;
        case "commando":
            List<Mission> missions = new ArrayList<>();
            for (int i = 6; i < commandArgs.length-1; i++) {
                String missionName = commandArgs[i];
                String state = commandArgs[i + 1];
                try {
                    Mission mission = new Mission(missionName, state);
                    missions.add(mission);
                } catch (IllegalArgumentException ee) {

                }
            }
            soldier = new Commando(commandArgs[1], commandArgs[2], commandArgs[3], Double.parseDouble(commandArgs[4]), commandArgs[5], missions);



            break;
        case"spy":
            soldier= new Spy(commandArgs[1], commandArgs[2], commandArgs[3], commandArgs[4]);

            break;
    }
    if(soldier != null){
        soldierMap.put(commandArgs[1],soldier);
    }
}
soldierMap.values().forEach(s -> System.out.println(s.toString()));
    }
}
