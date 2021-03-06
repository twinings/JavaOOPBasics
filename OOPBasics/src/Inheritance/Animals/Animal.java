package Inheritance.Animals;

public class Animal implements SoundProducible{
    private String name;
    private Integer age;
    private String gender;

    public Animal(String name,Integer age,String gender){
this.setName(name);
this.setAge(age);
this.setGender(gender);
    }

    private void setName(String name) {
        if(name==null || name.trim().length()==0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    private void setGender(String gender) {
        if(gender==null || gender.trim().length() == 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    private void setAge(Integer age) {
        if(age==null || age<0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private Integer getAge() {
        return age;
    }

    private String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + System.lineSeparator() + this.getName() + " " + this.getAge() + " " + this.getGender();
    }

    @Override
    public String produceSound() {
        return "Not implemented!";
    }
}
