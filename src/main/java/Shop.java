import Behaviours.ISell;
import Goods.Goods;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private ISell isell;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock(){
        return stock;
    }

    public void addStock(ISell iSell){
        stock.add(iSell);
    }

    public void removeStock(ISell iSell){
        stock.remove(iSell);
    }

    public double getProfit() {
        Double totalProfit = 0.0;
        for(ISell isell : this.stock){
        Goods goods = (Goods) isell;
        Double itemProfit = ((Goods) isell).getPrice() - ((Goods) isell).getCost();
        totalProfit += itemProfit;
        }
        return totalProfit;
    }
}


