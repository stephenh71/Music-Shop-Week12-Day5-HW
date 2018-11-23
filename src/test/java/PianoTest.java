import Goods.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("baby grand", 15000, 20000, "plink plonk", 88 );
    }

    @Test
    public void getDescription() {
        assertEquals("baby grand", piano.getDescription());
    }

    @Test
    public void getCost() {
        assertEquals(15000.0, piano.getCost());
    }

    @Test
    public void getPrice() {
        assertEquals(20000.0, piano.getPrice());
    }

    @Test
    public void playSound() {
        assertEquals("plink plonk",piano.play());
    }

    @Test
    public void getNumberKeys() {
        assertEquals(88, piano.getNumberKeys());
    }

    @Test
    public void getMarkUp() {
        assertEquals(0.33,piano.calculateMarkup(),0.01);
    }
}


