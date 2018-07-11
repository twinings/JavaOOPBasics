package InterfacesAndAbstractionExercise.P03Ferrari;

public interface Car {
    String model = "488-Spider";
    default String useBrakes(){
        return "Brakes!";
    }
    default String pushTheGasPedal(){
        return "Zadu6avam sA!";
    }

}
