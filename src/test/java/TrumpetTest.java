import Goods.Trumpet;
import enums.Type;
import org.junit.Before;
import org.junit.Test;

import static enums.Type.PICCOLO;
import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("trumpet",500,800,"trumpety trump", PICCOLO);
    }

    @Test
    public void getType() {
        assertEquals(PICCOLO, trumpet.getType());
    }
}
