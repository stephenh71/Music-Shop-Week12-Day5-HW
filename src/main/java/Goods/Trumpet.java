package Goods;

import enums.Type;

public class Trumpet extends Instrument {

    private Type type;

    public Trumpet(String description, double cost, double price, String sound, Type type) {
        super(description, cost, price, sound);
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
