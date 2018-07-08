package Inheritance.Animals;

public class Kitten extends Cat {
    private static final String GENDER = "Female";
    public Kitten(String name, Integer age ) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Miau";
    }
}
