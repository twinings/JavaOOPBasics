package InterfacesAndAbstractionExercise.P08MilitaryElite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeutenantGeneral extends Private implements ILeutenantGeneral{
    private List<IPrivate> privates;
    public LeutenantGeneral(String id, String firstName, String lastName, double salary,List<IPrivate> privates) {
        super(id, firstName, lastName, salary);
this.privates=privates;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Privates:");
        this.privates.stream().sorted((a,b)->b.getId().compareTo(a.getId())).forEach(s -> {
            sb.append(String.format("\n  %s",s.toString()));
        });
        return sb.toString();
    }
}
