package InterfacesAndAbstractionExercise.P06BirthdayCelebrations;

public class Pet implements Birthdate {
    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean isDesiredYear(String year) {
        return year.equals(this.getBirthdate().substring(this.getBirthdate().length()-4,this.getBirthdate().length()));
    }
}
