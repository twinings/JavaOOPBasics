package InterfacesAndAbstractionExercise.P02MultipleImplementation;

public class Citizen implements Birthable,Identifiable {
    private String name;
    private int age;
private String id;
private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
