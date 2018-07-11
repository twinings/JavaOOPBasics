package InterfacesAndAbstractionExercise.P08MilitaryElite;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    private List<IRepairs> repairs;
    public Engineer(String id, String firstName, String lastName, double salary, String corps,List<IRepairs> repairs) {
        super(id, firstName, lastName, salary, corps);

    this.repairs=repairs;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Corps: %s\n",this.getCorps()));
        sb.append("Repairs:");
        this.repairs.stream().forEach(r -> sb.append(System.lineSeparator()).append("  ").append(r.toString()));
    //Engineer:
        //Name: <firstName> <lastName> Id: <id> Salary: <salary>
        //Corps: <corps>
        //Repairs:
        //  <repair1 ToString()>
        //  <repair2 ToString()>
        //  …
        //  <repairN ToString()>
        return sb.toString()     ;
    }
}
