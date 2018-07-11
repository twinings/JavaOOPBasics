package InterfacesAndAbstractionExercise.P07FoodShortage;

public class Citizen implements Birthdate,Buyer,Identifiable {
    private String name;
    private  int age;
    private String id;
    private String birthdate;
    private int food;
    public Citizen(String name,int age,String id,String birthdate){
        this.name=name;
        this.age=age;
        this.id=id ;
        this.birthdate=birthdate;
        this.food=0;
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
    public boolean isDesiredYear(String year) {
        return year.equals(this.getBirthdate().substring(this.getBirthdate().length()-4,this.getBirthdate().length()));
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public void buyFood() {
this.food+=10;
    }
}
