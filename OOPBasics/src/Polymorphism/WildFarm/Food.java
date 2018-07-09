package Polymorphism.WildFarm;

public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.setQuantity(quantity);
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
