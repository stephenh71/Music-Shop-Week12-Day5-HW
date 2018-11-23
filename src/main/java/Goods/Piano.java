package Goods;

public class Piano extends Instrument  {

    private int numberKeys;

    public Piano(String description, double cost, double price, String sound, int numberKeys) {
        super(description, cost, price, sound);
        this.numberKeys = numberKeys;
    }

    public int getNumberKeys() {
        return numberKeys;
    }
}
