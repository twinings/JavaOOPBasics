package InterfacesAndAbstractionExercise.P06BirthdayCelebrations;

public class Citizen implements Birthdate,Identifiable {
    private String name;
    private  int age;
    private String id;
    private String birthdate;
    public Citizen(String name,int age,String id,String birthdate){
        this.name=name;
        this.age=age;
        this.id=id ;
        this.birthdate=birthdate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isDesiredYear(String year) {
        return year.equals(this.getBirthdate().substring(this.getBirthdate().length()-4,this.getBirthdate().length()));
    }

    @Override
    public String getBirthdate() {
        return birthdate;
    }
}
