package InterfacesAndAbstractionExercise.P06BirthdayCelebrations;

import InterfacesAndAbstractionExercise.P05BorderControl.Identifiable;

public class Robot implements Identifiable {
    private String model;
    private String id;
    public Robot(String model,String id){
        this.model=model;
        this.id=id;
    }
    @Override
    public String getId() {
        return this.id;
    }
}
