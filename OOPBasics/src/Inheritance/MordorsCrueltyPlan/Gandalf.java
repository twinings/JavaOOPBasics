package Inheritance.MordorsCrueltyPlan;

public class Gandalf {
    private int happiness;



        public void eat(String food) {
            switch (food.toLowerCase()) {
                case "cram":
                    this.happiness += 2;
                    break;
                case "lembas":
                    this.happiness += 3;
                    break;
                case "melon":
                case "apple":
                    this.happiness += 1;
                    break;
                case "honeycake":
                    this.happiness += 5;
                    break;
                case "mushrooms":
                    this.happiness -= 10;
                    break;
                default:
                    this.happiness -= 1;
                    break;
            }
        }

    private int getHappiness() {
        return happiness;
    }

    private String getMood(){
            int happiness = this.getHappiness();
            if(happiness < -5){
                return "Angry";
            }else if(happiness<0){
                return "Sad";
            }else if(happiness<15){
                return "Happy";
            }
            return "JavaScript";
        }

    @Override
    public String toString() {
        return this.getHappiness() + System.lineSeparator() + this.getMood();
    }
}
