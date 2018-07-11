package InterfacesAndAbstractionExercise.P08MilitaryElite;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier{
    private String corps;
    protected SpecialisedSoldier(String id, String firstName, String lastName, double salary,String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }


    @Override
    public String getCorps() {
        return corps;
    }

    private void setCorps(String corps) {
        if ("airforces".equalsIgnoreCase(corps) || "marines".equalsIgnoreCase(corps)) {
            this.corps = corps;
        }
    }
}
