package InterfacesAndAbstractionExercise.P08MilitaryElite;

public class Repair implements IRepairs{
    private String name;
    private int hourWorked;

    public Repair(String name, int hourWorked) {
        this.name = name;
        this.hourWorked = hourWorked;
    }

    public String getName() {
        return name;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d",this.name,this.hourWorked);
    }
}
