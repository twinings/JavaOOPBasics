package InterfacesAndAbstractionExercise.P08MilitaryElite;

import java.util.List;
import java.util.Set;

public class Commando extends SpecialisedSoldier implements ICommando {
    private List<Mission> missions;

    public Commando(String id, String firstName, String lastName, double salary, String corps, List<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }




    public List<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(super.toString()).append(System.lineSeparator());
        stringBuilder.append(String.format("Corps: %s\n",this.getCorps()));
        stringBuilder.append("Missions:");

        if(!missions.isEmpty()) {
            this.getMissions().stream().forEach(e -> stringBuilder.append(System.lineSeparator()).append("  ").append(e.toString()));
        }

        return stringBuilder.toString();
    }
}
