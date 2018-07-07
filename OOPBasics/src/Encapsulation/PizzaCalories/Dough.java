package Encapsulation.PizzaCalories;

public class Dough {
    private static final Double DEFAULT_DOUGH_MODIFIER = 2.0;

    private String type;
    private String bakingTechnique;
    private  Double weight;

    public Dough(String type,String bakingTechnique,double weight){
this.setType(type);
this.setBakingTechnique(bakingTechnique);
this.setWeight(weight);
    }

    private void setType(String type) {
        if(type==null || (!"White".equalsIgnoreCase(type) && !"Wholegrain".equalsIgnoreCase(type))){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.type = type;
    }

    private void setWeight(double weight) {
        if(weight<1 || weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(bakingTechnique == null || (!"crispy".equalsIgnoreCase(bakingTechnique) && !"chewy".equalsIgnoreCase(bakingTechnique) &&     !"homemade".equals(bakingTechnique.toLowerCase()) )){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

public Double getAllCals(){
        return DEFAULT_DOUGH_MODIFIER * this.getWeight()*this.getBakingCals()*this.getTypeCal();
}
    private String getBakingTechnique() {
        return bakingTechnique;
    }
    private Double getBakingCals(){
        switch (this.getBakingTechnique().toLowerCase()){
            case "crispy":
                return 0.9;
            case "chewy":
                return 1.1;
            case "homemade":
                return 1.0;
                default:
                    return null;
        }
    }
    private Double getTypeCal(){

        switch (this.getType().toLowerCase()){
            case "wholegrain":
                return 1.0;
            case "white":
                return 1.5;
                default:
                    return null;
        }
    }
}
