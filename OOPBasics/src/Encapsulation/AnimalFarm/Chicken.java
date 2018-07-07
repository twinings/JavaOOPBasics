package Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;
public Chicken(String name,int age){
this.setName(name);
this.setAge(age);
}

    private void setAge(int age) {
    if(age<0 || age>15){
        throw new IllegalArgumentException("Age should be between 0 and 15.");
    }
        this.age = age;
    }

    private void setName(String name) {
        if(name.isEmpty() || name.charAt(0) == ' '){
            throw new  IllegalArgumentException("Name cannot be empty.");
        }
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private double  calculateProductPerDay(int age){
    if(age<6  ){
        return 2;
    }
    else if(age<12){
        return 1;
    }
    else {
        return 0.75;
    }
    }
    public double   getProductPerDay(){
    return calculateProductPerDay(this.age);
    }
}
