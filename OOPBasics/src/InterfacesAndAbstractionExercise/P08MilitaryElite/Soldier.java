package InterfacesAndAbstractionExercise.P08MilitaryElite;

public abstract class Soldier implements ISoldier {
    private String id;
    private String firstName;
    private String lastName;
    protected Soldier(String id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override

    public String toString() {
        return String.format("Name: %s %s Id: %s", this.firstName, this.lastName, this.id);
    }
}
