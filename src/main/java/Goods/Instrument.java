package Goods;

import Behaviours.IPlay;

public abstract class Instrument extends Goods implements IPlay {

    private String sound;

    public Instrument(String description, double cost, double price, String sound) {
        super(description, cost, price);
        this.sound = sound;
    }

    public String play() {
        return sound;
    }

}
