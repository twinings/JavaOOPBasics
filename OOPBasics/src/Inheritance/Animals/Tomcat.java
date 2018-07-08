package Inheritance.Animals;

public class Tomcat extends Cat {
    private static final String GENDER = "Male";
    public Tomcat(String name, Integer age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Give me one million b***h";
    }
}
