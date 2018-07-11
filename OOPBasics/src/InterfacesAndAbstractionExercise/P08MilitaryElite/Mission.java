package InterfacesAndAbstractionExercise.P08MilitaryElite;

public class Mission implements IMissions {
private static final String FINISHED = "Finished";
    private static final String IN_PROGRESS ="inProgress";
    private String codeName;
    private String state;
    public Mission(String codeName,String state){
        this.codeName=codeName;
        this.setState(state);
    }

    private void setState(String state) {
        if(!FINISHED.equals(state) && !IN_PROGRESS.equals(state)){
            throw new IllegalArgumentException();
        }
        this.state = state;
    }
    @Override
    public void completeMission(){
        this.state=FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",this.codeName,this.state);
    }
    //Code Name: <codeName> State: <state>
}
