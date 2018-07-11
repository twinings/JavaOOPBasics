package InterfacesAndAbstractionExercise.P08MilitaryElite;

public  class Private extends Soldier implements IPrivate {

    private double salary;

    public Private(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("%s Salary: %.2f", super.toString(), this.salary);
    }
}
