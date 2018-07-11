package InterfacesAndAbstractionExercise.P03Ferrari;

public class Ferrari implements Car {
   private String driver;
   public Ferrari(String driver){
       this.driver=driver;
   }

    public String getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",Car.model,this.useBrakes(),this.pushTheGasPedal(),this.getDriver());
    }
}
