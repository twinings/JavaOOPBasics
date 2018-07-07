package Encapsulation;

public class Box {
    private double length;
    private double weigth;
    private double heigth;

    public Box(double length, double weigth, double heigth) {
        this.setLength(length);
        this.setWeigth(weigth);
        this.setHeigth(heigth);
    }
    public double getVolume(){
        return  this.heigth  * this.length * this.weigth;
    }
    public double  getLateralSurfaceArea(){
        return 2 * this.length * this.heigth + 2 * this.weigth * this.heigth;
    }
    public double getSurfaceArea() {
        return 2 * this.length * this.weigth + 2 * this.length * this.heigth + 2 * this.weigth * this.heigth;
    }

    public void setLength(double length) {
        if(length <= 0){
            throw  new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setWeigth(double weigth) {
        if(weigth <= 0){
            throw  new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.weigth = weigth;
    }

    public void setHeigth(double heigth) {
        if(heigth <= 0){
            throw  new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.heigth = heigth;
    }


}
