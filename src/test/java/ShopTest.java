import Behaviours.ISell;
import Goods.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        piano = new Piano("baby grand", 15000, 20000, "plink plonk", 88 );

    }

    @Test
    public void addStock() {
        shop.addStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void removeStock() {
        shop.addStock(piano);
        shop.addStock(piano);
        shop.removeStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void getProfit() {
        shop.addStock(piano);
        shop.addStock(piano);
        assertEquals(10000.0,shop.getProfit(),0.1);
    }
}

