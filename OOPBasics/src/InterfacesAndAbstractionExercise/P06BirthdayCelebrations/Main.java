package InterfacesAndAbstractionExercise.P06BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthdate> collect = new ArrayList<>();
        Birthdate entity= null;
        while (true){
            String[] line = reader.readLine().split("\\s");
            if("end".equalsIgnoreCase(line[0]))
            {
                break;
            }
          switch (line[0].toLowerCase()){
              case "citizen":
                  entity=new Citizen(line[1],Integer.parseInt(line[2]),line[3],line[4]);
                  break;
              case "pet":
                  entity=new Pet(line[1],line[2]);
                  break;
                  default:
                      break;

          }
          if(entity !=null) {
              collect.add(entity);
          }
            entity = null;
        }
        String year = reader.readLine();
        for(Birthdate date:collect){
            if(date.isDesiredYear(year)){
                System.out.println(date.getBirthdate());
            }
        }

    }


}
