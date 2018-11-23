package Goods;

public class Guitar extends Instrument {

    private int numberStrings;

    public Guitar(String description, double cost, double price, String sound, int numberStrings) {
        super(description, cost, price, sound);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }
}
