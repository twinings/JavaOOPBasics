package Inheritance.Person;


public class Person {
    private String name;
    private Integer age;
    public  Person(String name,Integer age){
        this.setName(name);
        this.setAge(age);
    }
public String getName() {
       return this.name;
    }

private void setName(String name) {
    if (name.length() < 3) {
        throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
    }
    this.name=name;
        }

public Integer getAge() {
        return this.age;
    }

    protected void setAge(int age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }

      this.age=age;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name: %s, Age: %d",this.getName(),this.getAge()));
        return stringBuilder.toString();
    }
    // 1. Add the Fields
    // 2. Add the Constructor
    // 3. Add the Properties
    // 4. Add the Methods
}
