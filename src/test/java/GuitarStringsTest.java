import Goods.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new GuitarStrings("guitar strings", 1,3 );
    }

    @Test
    public void getDescription(){
        assertEquals("guitar strings", guitarStrings.getDescription());
    }

    @Test
    public void getCost() {
        assertEquals(1.0,guitarStrings.getCost());
    }

    @Test
    public void getPrice() {
        assertEquals(3.0,guitarStrings.getPrice());
    }

    @Test
    public void getMarkUp() {
        assertEquals(2.0, guitarStrings.calculateMarkup());
    }
}
