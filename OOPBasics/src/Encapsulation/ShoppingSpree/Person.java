package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int money;
    private List<Product> bagOfproducts;
    public Person(String name,int money){
this.setName(name);
this.setMoney(money);
this.bagOfproducts = new ArrayList<>();
    }


public void tryaddProduct(Product product) {
    if (product.getCost() > this.getMoney()) {
        throw new IllegalArgumentException(String.format("%s can't afford %s", this.getName(), product.getName()));
    } else {

        this.setMoney(this.getMoney() - product.getCost());
        this.addProduct(product);

    }
}
    private void addProduct(Product product){
        this.bagOfproducts.add(product);
    }

    public List<Product> getBagOfproducts() {
        return Collections.unmodifiableList(this.bagOfproducts);
    }

    @Override
    public String toString() {
        if(this.getBagOfproducts().size()==0){
            return this.getName() + " - " + "Nothing bought";
        }
     return this.getName() + " - "  + String.join(", ",this.getBagOfproducts().stream().map(Object::toString).collect(Collectors.toList()));
    }

    private void setName(String name) {
        if(name==null || name.trim().length() == 0){
            throw new  IllegalArgumentException("Name cannot be empty.");
        }
        this.name=name;
    }

    private void setMoney(int money) {
        if(money<0){
                    throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private String getName() {
        return name;
    }

    private int getMoney() {
        return money;
    }
}
