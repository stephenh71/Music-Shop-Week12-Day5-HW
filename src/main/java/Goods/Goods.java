package Goods;

import Behaviours.ISell;

public abstract class Goods implements ISell {

    private String description;
    private double cost;
    private double price;

    public Goods(String description, double cost, double price) {
        this.description = description;
        this.cost = cost;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public double calculateMarkup(){
        double markUp = price/cost - 1;
        return markUp;
    }
}
